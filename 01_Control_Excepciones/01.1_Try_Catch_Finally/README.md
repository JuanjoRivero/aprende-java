# 01.1 Try, Catch y Finally
---
En esta sección, exploraremos el uso de `try`, `catch` y `finally` en Java. Estas estructuras son fundamentales para manejar errores y excepciones durante la ejecución de un programa.

## Índice
---
1. [Try-Catch](#1-try-catch)
2. [Try-Catch-Finally](#2-try-catch-finally)
3. [Métodos Importantes para Excepciones](#3-métodos-importantes-para-excepciones)

### 1. Try-Catch
---
`try-catch` es una estructura que permite manejar excepciones en Java. El código que puede lanzar una excepción se coloca dentro del bloque `try`. Si ocurre una excepción, el flujo del programa se interrumpe y el control pasa al bloque `catch`, donde se maneja la excepción.

#### Estructura Básica
```java
try {
    // Código que puede lanzar una excepción
} catch (TipoDeExcepcion e) {
    // Código para manejar la excepción
}
```

#### Ejemplo de uso
```java
try {
    int division = 10 / 0; // Provoca una excepción (ArithmeticException)
} catch (ArithmeticException e) {
    System.out.println("No se puede dividir por cero.");
}
```

### 2. Try-Catch-Finally
---
La estructura `try-catch-finally` permite agregar un bloque `finally` al final de `try-catch`. Este bloque `finally` se ejecuta siempre, independientemente de si ocurre una excepción o no, y es especialmente útil para liberar recursos o realizar acciones de limpieza necesarias.

#### Estructura Básica

```java
try {
    // Código que puede lanzar una excepción
} catch (TipoDeExcepcion e) {
    // Código para manejar la excepción
} finally {
    // Código que siempre se ejecuta
}
```

#### Ejemplo de uso

> **⚠️ IMPORTANTE:**  
> El método `Integer.parseInt()` convierte una cadena de texto (`String`) en un número entero (`int`).  
> Si la cadena contiene caracteres que no pueden ser interpretados como un número entero (por ejemplo, `"abc"` o `"123.45"`), el método lanzará una excepción `NumberFormatException`.

```java
try {
    int numero = Integer.parseInt("abc"); // Provoca una excepción (NumberFormatException)
} catch (NumberFormatException e) {
    System.out.println("Formato de número inválido.");
} finally {
    System.out.println("Bloque finally ejecutado.");
}
```
### 3. Métodos Importantes para Excepciones

Java proporciona métodos útiles en la clase `Exception` para obtener información detallada sobre una excepción. Algunos de los métodos más comunes incluyen:

- **`getMessage()`**: Devuelve un mensaje con la descripción del error.
- **`toString()`**: Imprime la clase que generó la excepción y un mensaje descriptivo
- **`printStackTrace()`**: Imprime el método y el mensaje, lo mismo que si no lo controláramos PERO permite seguir ejecutando el código.

#### Ejemplo de Uso de Métodos Importantes
```java
try {
    int numero = Integer.parseInt("abc"); // Provoca una excepción (NumberFormatException)
} catch (NumberFormatException e) {
    System.out.println("Mensaje de error: " + e.getMessage());
    System.out.println("Excepción completa (toString): " + e.toString()); // Muestra la representación de la excepción
    e.printStackTrace(); // Imprime el stack trace de la excepción
}
```
- `e.getMessage()` mostraría: **Mensaje de error: For input string: "abc"**
- `e.toString()` mostraría: **java.lang.NumberFormatException: For input string: "abc"**
- `e.printStackTrace()` mostraría: 
        **java.lang.NumberFormatException: For input string: "abc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:662)
        at java.base/java.lang.Integer.parseInt(Integer.java:778)
        at prueba.main(prueba.java:4)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:484)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:208)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:135)**