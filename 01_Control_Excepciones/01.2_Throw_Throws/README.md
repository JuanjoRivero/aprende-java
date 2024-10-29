
# 01.2 Throw y Throws
---
En esta sección, exploraremos el uso de `throw` y `throws` en Java. Estas palabras clave son fundamentales para manejar excepciones personalizadas y para declarar las excepciones que un método puede lanzar.

## Índice
---
1. [Throw](#1-throw)
2. [Throws](#2-throws)
3. [Ejemplos de Uso](#3-ejemplos-de-uso)

### 1. Throw
---
La palabra clave `throw` se utiliza para lanzar explícitamente una excepción. Esto permite al programador crear excepciones personalizadas o relanzar excepciones ya existentes.

#### Estructura Básica
```java
throw new TipoDeExcepcion("Mensaje de error");
```

#### Ejemplo de uso
```java
public class EjemploThrow {
    public static void validarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("La edad debe ser al menos 18 años.");
        }
    }

    public static void main(String[] args) {
        try {
            validarEdad(15); // Provoca IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

### 2. Throws
---
La palabra clave `throws` se utiliza en la declaración de un método para indicar que el método puede lanzar una o más excepciones. Esto es útil para informar a los llamadores del método que deben manejar las excepciones.

#### Estructura Básica
```java
public void metodo() throws TipoDeExcepcion {
    // Código que puede lanzar la excepción
}
```

#### Ejemplo de uso
```java
public class EjemploThrows {
    public static void dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        System.out.println("Resultado: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            dividir(10, 0); // Provoca ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

### 3. Ejemplos de Uso
---
A continuación, se presentan ejemplos que combinan `throw` y `throws` para manejar excepciones de manera efectiva.

#### Ejemplo de `throw` y `throws` en un mismo contexto
```java
public class EjemploCombinado {
    public static void validarNumero(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
    }

    public static void main(String[] args) {
        try {
            validarNumero(-5); // Provoca IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```