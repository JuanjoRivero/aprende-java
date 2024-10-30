/*
Ejercicio 3: Multiplicación por 2

Enunciado: Utiliza un bucle `while` para multiplicar un número inicial por 2
hasta que el resultado sea mayor que 100. Imprime cada resultado.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 6; // Número inicial

        while (numero <= 100) {
            System.out.println(numero);
            numero *= 2;
        }
    }
}