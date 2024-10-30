/*
Ejercicio 5: Día de la Semana

Enunciado: Utiliza un bucle `while` para solicitar al usuario que ingrese un número
del 1 al 7, que representa los días de la semana. Utiliza un `switch` para imprimir
el nombre del día correspondiente. El bucle debe continuar hasta que se ingrese
un número fuera del rango.
*/
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia;

        while (true) {
            System.out.print("Ingrese un número del 1 al 7 para un día de la semana (otro número para salir): ");
            dia = teclado.nextInt();

            if (dia < 1 || dia > 7) {
                System.out.println("Número fuera de rango. Saliendo del programa...");
                break;
            }

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
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Número no válido");
                    break;
            }
        }
    }
}