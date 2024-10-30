/*
Ejercicio 1: Sumar Números

Enunciado: Completa el programa para que, al ingresar un número,
imprima la suma de los números del 1 al número ingresado. No puede
ser superior a 10 este numero. Si el usuario ingresa -a o --all,
el programa debe imprimir la suma de los números del 1 al 10.
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número o -a/--all: ");
        String input = teclado.nextLine(); // Leer entrada del usuario

        switch (input){
            case "-a":
            case "--all":
                calcularTodasSumas();
                break;
            case "1":
                calcularSumas(1);
                break;
            case "2":
                calcularSumas(2);
                break;
            case "3":
                calcularSumas(3);
                break;
            case "4":
                calcularSumas(4);
                break;
            case "5":
                calcularSumas(5);
                break;
            case "6":
                calcularSumas(6);
                break;
            case "7":
                calcularSumas(7);
                break;
            case "8":
                calcularSumas(8);
                break;
            case "9":
                calcularSumas(9);
                break;
            case "10":
                calcularSumas(10);
                break;

        }
    }

    public static void calcularTodasSumas(){
        for (int i = 1 ; i <= 10 ; i++){
            calcularSumas(i);
            System.out.println("--------");
        }
    }

    public static void calcularSumas(int numero){
        int suma = 0;
        for (int i = 1; i <= numero ; i++){
            suma += i;
        }
        System.out.println(suma);
    }
}