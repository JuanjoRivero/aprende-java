/*
Ejercicio 5: Excepciones Anidadas y Métodos toString() y getMessage()

Enunciado: Completa los bloques catch y finally para manejar un conjunto anidado
de excepciones. El bloque try contiene dos operaciones: una división entre cero y
una conversión de cadena a entero. En el primer bloque catch, captura la
ArithmeticException y usa toString() para mostrar el nombre y mensaje de la excepción.
En el segundo bloque catch, captura NumberFormatException y muestra el mensaje
de error usando getMessage(). Finalmente, en el bloque finally, muestra
"Fin de la operación".
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt("abc"); // Provoca NumberFormatException
            int resultado = 10 / 0; // Provoca ArithmeticException
        }
        catch (ArithmeticException e) { // RELLENA EL PARENTESIS
            System.out.println(e.toString());// Completa aquí para capturar la excepción y mostrar el nombre y mensaje usando toString()
        }
        catch (NumberFormatException e) { // RELLENA EL PARENTESIS
            System.out.println(e.getMessage());// Completa aquí para capturar la excepción y mostrar el mensaje usando getMessage()
        }
        finally {
            System.out.println("Fin de la operación");// Completa aquí el bloque finally con el mensaje "Fin de la operación"
        }
    }
}