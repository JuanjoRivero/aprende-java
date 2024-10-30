# 01.3 Assert
---
En esta sección, exploraremos el uso de `assert` en Java, una herramienta útil para la depuración y validación de condiciones en el código.

## ¿Qué es `assert`?
`assert` es una instrucción en Java que se utiliza para comprobar condiciones que se espera que sean verdaderas durante la ejecución del programa. Si la condición evaluada es falsa, se lanzará una `AssertionError`, lo que indica una falla en el programa. Esto es útil para identificar errores durante la fase de desarrollo.

## Estructura Básica
```java
assert expresiónBooleana : mensajeOpcional;
```
- **`expresiónBooleana`**: La condición a evaluar. Si es `false`, se lanzará `AssertionError`.
- **`mensajeOpcional`**: Un mensaje que proporciona más contexto sobre la falla (opcional).

## Ejemplo de Uso

### Ejemplo Simple
```java
public class EjemploAssert {
    public static void main(String[] args) {
        int numero = -5;
        assert numero >= 0 : "El número debe ser positivo"; // Esto lanzará AssertionError
        System.out.println("Número: " + numero);
    }
}
```
Si `numero` es menor que cero, se lanzará `AssertionError` con el mensaje "El número debe ser positivo".

### Activando Asserts
Por defecto, las aserciones están desactivadas en Java. Para activarlas, debes ejecutar la aplicación con la opción `-ea` (o `-enableassertions`):
```bash
java -ea EjemploAssert
```

### Ejemplo con Método
```java
public class EjemploAssertConMetodo {
    public static void main(String[] args) {
        validarEdad(15); // Esto lanzará AssertionError
    }

    public static void validarEdad(int edad) {
        assert edad >= 18 : "La edad debe ser al menos 18 años"; // Comprobación de la edad
        System.out.println("Edad válida: " + edad);
    }
}
```