/*
Ejercicio 5: Evaluación de Calificaciones

Enunciado: Completa el bucle for para evaluar las calificaciones de 5 estudiantes.
Solicita al usuario que ingrese cada calificación y luego imprime "Aprobado"
para calificaciones mayores o iguales a 6 y "Reprobado" para las demás.
Usa un switch dentro del bucle para evaluar las calificaciones.
*/
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Dime una calificación: ");
            int calificacion = teclado.nextInt();
            switch (calificacion){
                case 10:
                case 9:
                case 8:
                case 7:
                case 6:
                    System.out.println("Aprobado");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("Reprobado");
                    break;
                default:
                    System.out.println("Numero introducido no valido");
                    break;
            }
        }
    }
}