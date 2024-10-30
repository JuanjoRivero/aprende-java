/*
Ejercicio 1: Menú Básico

Crea un programa en Java llamado MenuBasico.java que muestre un menú con tres opciones:
1. Mostrar mensaje de bienvenida.
2. Mostrar mensaje de despedida.
3. Salir del programa.

El menú debe repetirse hasta que el usuario elija salir. Usa Scanner y un switch para manejar las opciones.
*/

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar mensaje de bienvenida");
            System.out.println("2. Mostrar mensaje de despedida");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Bienvenido al programa!");
                    break;
                case 2:
                    System.out.println("¡Hasta luego! Que tengas un buen día.");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 3.");
                    break;
            }
        }
    }
}