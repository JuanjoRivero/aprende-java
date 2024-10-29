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
        String input = teclado.nextLine(); // Leer entrada del usuario

        // Completa aquí la estructura switch para manejar -a, --all y otros números
    }
}