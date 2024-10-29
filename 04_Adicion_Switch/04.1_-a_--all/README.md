# 02.3 -a y --all

En esta sección, aprenderemos a manejar entradas especiales en un `switch`, donde si se recibe `-a` o `--all`, se ejecutarán todas las opciones disponibles. Esto se puede lograr mediante la definición de un método externo que se encargue de realizar todas las operaciones.

## Ejemplo: Tabla de Multiplicar

En este ejemplo, si el usuario ingresa `-a` o `--all`, el programa imprimirá la tabla de multiplicar para todos los números del 1 al 10, mientras que para un número normal, solo imprimirá la tabla de multiplicar para ese número.

### Código de Ejemplo
```java
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número o -a/--all: ");
        String numeroString = teclado.nextLine(); // Leer entrada del usuario

        switch (numeroString) {
            case "-a":
            case "--all":
                imprimirTablasMultiplicar(); // Llama al método para imprimir todas las tablas
                break;
            default:
                try {
                    int numero = Integer.parseInt(input); // Convertir entrada a número
                    imprimirTablaMultiplicar(numero); // Llama al método para imprimir la tabla del número
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingresa un número o -a/--all.");
                }
                break;
        }
    }

    // Método para imprimir la tabla de multiplicar de un número específico
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Método para imprimir tablas de multiplicar del 1 al 10
    public static void imprimirTablasMultiplicar() {
        for (int i = 1; i <= 10; i++) {
            imprimirTablaMultiplicar(i); // Llama al método para imprimir la tabla de cada número
            System.out.println(); // Espacio entre tablas
        }
    }
}
```
### Explicación del Código
1. Entrada del Usuario: El programa solicita al usuario que ingrese un número o -a/--all.
2. Estructura Switch:
2.1 Si el usuario ingresa -a o --all, se llama al método imprimirTablasMultiplicar(), que imprime la tabla de multiplicar para todos los números del 1 al 10.
2.2 Para cualquier otra entrada, se intenta convertir la entrada a un número y se llama a imprimirTablaMultiplicar(numero) para imprimir solo esa tabla.
3. Manejo de Errores: Si la entrada no es algo que no es número entero, -a o --all, se muestra un mensaje de error.