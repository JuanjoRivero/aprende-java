/*
Ejercicio 3: Estructura `else if`

Enunciado: Completa el bloque `if-else if` para verificar si un número es positivo, negativo o cero.
Imprime un mensaje apropiado para cada caso.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 0; // Cambia este valor para probar
        if (numero > 0){
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else{
            System.out.println("El numero es 0");
        }
    }
}