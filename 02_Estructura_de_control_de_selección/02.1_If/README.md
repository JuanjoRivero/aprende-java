# 02.1 If
---
En esta sección, exploraremos la estructura de control de selección `if` en Java. Esta estructura permite ejecutar bloques de código condicionalmente, dependiendo de si se cumple o no una determinada condición.

## Índice
---
1. [Estructura básica de `if`](#1-estructura-básica-de-if)
2. [Uso de `if-else`](#2-uso-de-if-else)
3. [Uso de `else if`](#3-uso-de-else-if)
4. [Ejemplos de uso](#4-ejemplos-de-uso)

### 1. Estructura básica de `if`
---
La estructura `if` permite ejecutar un bloque de código si la condición especificada es verdadera.

#### Estructura Básica
```java
if (condicion) {
    // Código a ejecutar si la condición es verdadera
}
```

### 2. Uso de `if-else`
---
La estructura `if-else` permite manejar dos caminos: uno si la condición es verdadera y otro si es falsa.

#### Estructura Básica
```java
if (condicion) {
    // Código a ejecutar si la condición es verdadera
} else {
    // Código a ejecutar si la condición es falsa
}
```

### 3. Uso de `else if`
---
La estructura `else if` permite evaluar múltiples condiciones secuencialmente. Si la primera condición no es verdadera, se evalúa la siguiente.

#### Estructura Básica
```java
if (condicion1) {
    // Código si condicion1 es verdadera
} else if (condicion2) {
    // Código si condicion2 es verdadera
} else {
    // Código si ninguna condición anterior es verdadera
}
```

### 4. Ejemplos de uso
---
#### Ejemplo con `if`
```java
int numero = 10;
if (numero > 0) {
    System.out.println("El número es positivo.");
}
```

#### Ejemplo con `if-else`
```java
int numero = -5;
if (numero > 0) {
    System.out.println("El número es positivo.");
} else {
    System.out.println("El número es negativo o cero.");
}
```

#### Ejemplo con `else if`
```java
int numero = 0;
if (numero > 0) {
    System.out.println("El número es positivo.");
} else if (numero < 0) {
    System.out.println("El número es negativo.");
} else {
    System.out.println("El número es cero.");
}
```