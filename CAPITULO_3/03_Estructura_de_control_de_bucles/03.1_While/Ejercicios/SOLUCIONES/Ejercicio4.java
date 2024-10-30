/*
Ejercicio 4: Clasificación de Notas

Enunciado: Utiliza un bucle `do-while` para solicitar al usuario que ingrese notas
de estudiantes. Utiliza un `if` para clasificar la nota como "A" -> 10 y 9, "B" -> 8 y 7, "C" -> 6 y 5 o "D" -> menos de 5
y muestra la clasificación hasta que se ingrese un valor negativo.

(NOTA: && es el operador lógico and, que sirve para comprobar en una condicion 2 condiciones (A == 10 && A == 9))
*/
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota (valor negativo para salir): ");
            nota = teclado.nextInt();

            if (nota >= 0) {
                if (nota >= 9 && nota <= 10) {
                    System.out.println("Clasificación: A");
                } else if (nota >= 7 && nota < 9) {
                    System.out.println("Clasificación: B");
                } else if (nota >= 5 && nota < 7) {
                    System.out.println("Clasificación: C");
                } else if (nota < 5) {
                    System.out.println("Clasificación: D");
                } else {
                    System.out.println("Nota no válida. Debe estar entre 0 y 10.");
                }
            }
        } while (nota >= 0);

        System.out.println("Saliendo del programa...");
    }
}