/*
Ejercicio 3: Evaluación de Calificaciones

Enunciado: Completa el programa para que, al ingresar un número,
imprima "Aprobado" para calificaciones mayores o iguales a 5
y "Reprobado" para las demás.
Si el usuario ingresa -a o --all, el programa debe evaluar y mostrar
el estado (Aprobado/Reprobado) para calificaciones del 1 al 10.

Además, añade un manejo de errores para si a alguien se le ocurre
pasar un texto por el Scanner, que hay mucho pillín.
*/
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número o -a/--all: ");
        String input = teclado.nextLine();

        switch (input) {
            case "-a":
            case "--all":
                evaluarTodasCalificaciones();
                break;
            default:
                try {
                    int calificacion = Integer.parseInt(input);
                    if (calificacion >= 1 && calificacion <= 10) {
                        evaluarCalificacion(calificacion);
                    } else {
                        System.out.println("Por favor, ingresa un número entre 1 y 10.");
                    }
                } catch (Exception e) {
                    System.out.println("Entrada no válida. Ingresa un número entre 1 y 10 o usa -a/--all.");
                }
                break;
        }
    }

    public static void evaluarTodasCalificaciones() {
        for (int i = 1; i <= 10; i++) {
            evaluarCalificacion(i);
            System.out.println("-----------");
        }
    }

    public static void evaluarCalificacion(int calificacion) {
        if (calificacion >= 5) {
            System.out.println("Calificación " + calificacion + ": Aprobado");
        } else {
            System.out.println("Calificación " + calificacion + ": Reprobado");
        }
    }
}
