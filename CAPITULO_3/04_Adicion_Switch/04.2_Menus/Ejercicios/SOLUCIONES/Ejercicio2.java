/*
Ejercicio 2: Menú con Manejo de Errores

Crea un programa en Java llamado MenuConManejoErrores.java que muestre un menú con las siguientes opciones:
1. Mostrar mensaje de bienvenida.
2. Mostrar mensaje de despedida.
3. Salir del programa.

Usa Scanner y un switch para manejar las opciones. Agrega manejo de errores para que el programa no se cierre si el usuario introduce un valor no numérico.
*/

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar mensaje de bienvenida");
            System.out.println("2. Mostrar mensaje de despedida");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            try {
                String input = teclado.nextLine();
                int opcion = Integer.parseInt(input);

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
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número del 1 al 3.");
            }
        }
    }
}
