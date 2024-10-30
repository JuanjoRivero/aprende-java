# 03.2 For
---
En esta sección, exploraremos la estructura de control de bucle `for` en Java. Este bucle se utiliza para iterar sobre un bloque de código un número específico de veces.

### 1. Bucle `for`
---
El bucle `for` se utiliza cuando se conoce de antemano cuántas veces se debe ejecutar un bloque de código. La estructura básica del bucle `for` incluye la inicialización de una variable, la condición de continuación y el incremento o decremento de la variable.

#### Estructura Básica
```java
for (inicialización; condición; actualización) {
    // Código a ejecutar en cada iteración
}
```
- Inicialización: Se utiliza para declarar e inicializar una variable de control. Se ejecuta solo **UNA** vez al comienzo del bucle. Suele nombrarse `i`, `j` o `k`.
- Condición: Es una expresión booleana que se evalúa antes de cada iteración. Si es `true`, se ejecuta el bloque de código; si es `false`, se finaliza el bucle.
- Actualización: Se ejecuta al final de cada iteración y se usa para modificar la variable de control (por ejemplo, incrementarla [`i++`] o decrecerla [`i--`]).

#### Ejemplo de uso
Este es un ejemplo sencillo:
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteración: " + i);
}
```
Este es un ejemplo construido un poco más grande para que se entienda bien:
```java
// Ejemplo de uso del bucle for clásico: Sumar los números del 1 al 100
public class SumaNumeros {
    public static void main(String[] args) {
        int sumaTotal = 0; // Variable para almacenar la suma

        // Bucle for para iterar desde 1 hasta 100
        for (int i = 1; i <= 100; i++) {
            sumaTotal += i; // Sumar el número actual a la suma total
            System.out.println("Sumando: " + i + " | Suma total hasta ahora: " + sumaTotal);
        }

        // Imprimir el resultado final
        System.out.println("La suma total de los números del 1 al 100 es: " + sumaTotal);
    }
}
```