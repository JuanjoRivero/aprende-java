/*
Ejercicio 2: Suma de Números

Enunciado: Utiliza un bucle `do-while` para solicitar al usuario que ingrese números
hasta que ingrese un número negativo. Imprime la suma total de los números ingresados.
*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int suma = 0;

        do {
            System.out.println("Ingresa un numero, se iran sumando hasta que indiques uno negativo (restará a la suma total): ");
            numero = teclado.nextInt();
            suma += numero;
        }while (numero > 0);

        System.out.println(suma);
    }
}