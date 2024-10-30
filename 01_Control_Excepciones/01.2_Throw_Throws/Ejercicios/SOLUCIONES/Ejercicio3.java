/*
Ejercicio 3: Validación de Número y Lanzamiento de Excepción

Enunciado: Completa el bloque catch para manejar una IllegalArgumentException.
El método validarNumero lanza una IllegalArgumentException si el número es negativo.
Captura esta excepción en el método main y muestra el mensaje "Error: El número no puede ser negativo."
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            validarNumero(-5); // -> Provoca IllegalArgumentException
        } catch (IllegalArgumentException e) { // RELLENA EL PARENTESIS
            System.out.println("Error: " + e.getMessage());// Completa aquí para capturar la excepción y mostrar el mensaje de error
        }
        System.out.println("La ejecución continúa");
    }

    public static void validarNumero(int numero) throws IllegalArgumentException{
        if (numero > 0)  { //Completa el parentesis
            throw new IllegalArgumentException("Error: El número no puede ser negativo.");// Completa aquí para lanzar la excepción
        }
    }
}