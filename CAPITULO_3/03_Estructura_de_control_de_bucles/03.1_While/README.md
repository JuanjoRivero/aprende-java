# 03.1 While
---
En esta sección, exploraremos las estructuras de control de bucle `while` y `do-while` en Java. Estos bucles se utilizan para repetir un bloque de código mientras se cumpla una condición específica.

## Índice
---
1. [Bucle `while`](#1-bucle-while)
2. [Bucle `do-while`](#2-bucle-do-while)
3. [Diferencias entre `while` y `do-while`](#3-diferencias-entre-while-y-do-while)
4. [Ejemplo de uso](#4-ejemplo-de-uso)

### 1. Bucle `while`
---
El bucle `while` ejecuta un bloque de código mientras la condición especificada sea verdadera. Si la condición es falsa desde el principio, el bloque de código no se ejecutará ni una sola vez.

#### Estructura Básica
```java
while (condición) {
    // Código a ejecutar mientras la condición sea verdadera
}
```

#### Ejemplo de uso
```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++; // Incrementa el contador
}
```

### 2. Bucle `do-while`
---
El bucle `do-while` es similar al bucle `while`, pero garantiza que el bloque de código se ejecute al menos una vez, independientemente de la condición. La condición se evalúa después de que se ejecuta el bloque.

#### Estructura Básica
```java
do {
    // Código a ejecutar
} while (condición);
```

#### Ejemplo de uso
```java
int contador = 0;
do {
    System.out.println("Contador: " + contador);
    contador++; // Incrementa el contador
} while (contador < 5);
```

### 3. Diferencias entre `while` y `do-while`
---
- **Ejecución**: El bucle `while` puede no ejecutarse ninguna vez si la condición es falsa, mientras que el `do-while` siempre se ejecuta al menos una vez.
- **Evaluación de la condición**: En `while`, la condición se evalúa antes de cada iteración, y en `do-while`, se evalúa después.

### 4. Ejemplo de uso
---
Aquí hay un ejemplo que utiliza tanto el bucle `while` como el bucle `do-while`:

```java
int numero = 1;

// Bucle while
while (numero <= 3) {
    System.out.println("Número en while: " + numero);
    numero++;
}

// Reiniciar el número
numero = 1;

// Bucle do-while
do {
    System.out.println("Número en do-while: " + numero);
    numero++;
} while (numero <= 3);
```