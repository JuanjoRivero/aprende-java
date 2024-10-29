package org.example;
/*
Ejercicio 2: Uso de throws en Método

Enunciado: Completa el bloque catch para capturar una excepción y el throw en el método.
El método dividir lanza una ArithmeticException si el divisor es cero.
Captura esta excepción y muestra "Error: División por cero no permitida."
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            dividir(59, 0); // Provoca ArithmeticException
        } catch (ArithmeticException e) { // RELLENA EL PARENTESIS
            System.out.println("Error: " + e.getMessage())
        }
        System.out.println("La ejecución continúa");
    }

    public static void dividir(int a, int b) throws ArithmeticException{ // Añade un thows basado en ArithmeticException
        if (b == 0) {
            throw new ArithmeticException ("Esto es un error");// Completa aquí para lanzar la excepción
        }
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }
}
