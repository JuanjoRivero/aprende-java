/*
Ejercicio 4: Números Pares

Enunciado: Completa el bucle for para imprimir los números del 1 al 20 que son pares.
Utiliza un if dentro del bucle para comprobar si un número es par.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}