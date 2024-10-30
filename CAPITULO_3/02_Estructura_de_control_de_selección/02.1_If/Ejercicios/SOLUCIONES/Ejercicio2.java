/*
Ejercicio 2: Estructura `if-else`

Enunciado: Completa el bloque `if-else` para verificar si el número es negativo.
Si es negativo, debe imprimir "El número es negativo", y si no, "El número es cero o positivo".
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = -3;
        if (numero < 0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo o cero");
        }
    }
}