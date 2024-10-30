/*
Ejercicio 2: Imprimir Frases

Enunciado: Completa el programa para que, al ingresar un número,
imprima "Hola" esa cantidad de veces. El numero maximo es 15.
Si el usuario ingresa -a o --all, el programa debe imprimir "Hola" 15 veces.
*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número o -a/--all: ");
        String input = teclado.nextLine();

        switch (input) {
            case "-a":
            case "--all":
                imprimirTodosHola();
                break;
            case "1":
                imprimirHola(1);
                break;
            case "2":
                imprimirHola(2);
                break;
            case "3":
                imprimirHola(3);
                break;
            case "4":
                imprimirHola(4);
                break;
            case "5":
                imprimirHola(5);
                break;
            case "6":
                imprimirHola(6);
                break;
            case "7":
                imprimirHola(7);
                break;
            case "8":
                imprimirHola(8);
                break;
            case "9":
                imprimirHola(9);
                break;
            case "10":
                imprimirHola(10);
                break;
            case "11":
                imprimirHola(11);
                break;
            case "12":
                imprimirHola(12);
                break;
            case "13":
                imprimirHola(13);
                break;
            case "14":
                imprimirHola(14);
                break;
            case "15":
                imprimirHola(15);
                break;
            default:
                System.out.println("Entrada no válida.");
                break;
        }
    }

    public static void imprimirTodosHola(){
        for (int i = 1 ; i <= 15 ; i++){
            imprimirHola(i);
            System.out.println("--------");
        }
    }

    public static void imprimirHola(int cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Hola");
        }
    }
}