package org.example;
/*
Ejercicio 1: Lanzar Excepción Básica

Enunciado: Completa el bloque catch para capturar una excepción lanzada.
El código en el bloque try intenta validar la edad, lanzando una
IllegalArgumentException si la edad es menor de 18. Muestra el mensaje
de error "Error: La edad debe ser al menos 18 años."
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            validarEdad(15); // Provoca IllegalArgumentException
        } catch () { // RELLENA EL PARENTESIS
            // Completa aquí para capturar la excepción y mostrar el mensaje de error
        }
        System.out.println("La ejecución continúa");
    }
    public static void validarEdad(int edad) {
        if (edad < 18) {
            // Completa aquí para lanzar la excepción
        }
    }
}

