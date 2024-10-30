/*
Ejercicio 4: Comprobación de Par o Impar

Enunciado: Completa el bloque `if-else` para determinar si un número es par o impar.
Si es par, debe imprimir "El número es par", y si es impar, "El número es impar".
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 7;
        if (numero % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}