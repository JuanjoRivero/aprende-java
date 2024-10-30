# 02.2 Switch
---
En esta sección, exploraremos la estructura de control `switch` en Java. El `switch` se utiliza para ejecutar uno de múltiples bloques de código basado en el valor de una expresión. Es especialmente útil cuando se tiene un número fijo de valores posibles.

## Índice
---
1. [Estructura básica de `switch`](#1-estructura-básica-de-switch)
2. [Uso de `case`](#2-uso-de-case)
3. [Uso de `default`](#3-uso-de-default)
4. [Ejemplos de uso](#4-ejemplos-de-uso)

### 1. Estructura básica de `switch`
---
La estructura `switch` evalúa una expresión y ejecuta el bloque de código correspondiente al valor que coincide con uno de los `case`.

#### Estructura Básica
```java
switch (expresion) {
    case valor1:
        // Código a ejecutar si expresion es igual a valor1
        break;
    case valor2:
        // Código a ejecutar si expresion es igual a valor2
        break;
    // Otros casos...
    default:
        // Código a ejecutar si no coincide con ninguno de los casos
}
```

### 2. Uso de `case`
---
Cada `case` especifica un valor que se comparará con el resultado de la expresión. Si hay una coincidencia, se ejecuta el código dentro de ese `case`.

### 3. Uso de `default`
---
El bloque `default` se ejecuta si no hay coincidencias con ninguno de los `case`. Es similar a la cláusula `else` en una estructura `if`.

#### Ejemplo básico de `switch`
```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Día no válido");
}
```

### 4. Ejemplos de uso
---
#### Ejemplo con `switch`
```java
int mes = 4;
switch (mes) {
    case 1:
        System.out.println("Enero");
        break;
    case 2:
        System.out.println("Febrero");
        break;
    case 3:
        System.out.println("Marzo");
        break;
    case 4:
        System.out.println("Abril");
        break;
    default:
        System.out.println("Mes no válido");
}
```

#### Ejemplo sin `break`
>*Nota: Sin el `break`, el flujo continuará ejecutando los siguientes `case`, lo que puede no ser el comportamiento deseado.*
```java
int numero = 2;
switch (numero) {
    case 1:
        System.out.println("Uno");
    case 2:
        System.out.println("Dos");
    case 3:
        System.out.println("Tres");
        break;
    default:
        System.out.println("Número no válido");
}
```