/*
Ejercicio 4: Manejo de Múltiples Excepciones y Uso de printStackTrace()

Enunciado: Completa los bloques catch para manejar dos tipos de excepciones:
ArithmeticException y NumberFormatException. En el bloque catch de
ArithmeticException, muestra el mensaje "Error de división por cero".
En el bloque catch de NumberFormatException, usa printStackTrace() para mostrar
el rastro del error.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            int resultado = 87 / 0; // Provoca ArithmeticException
            int numero = Integer.parseInt("Texto"); // Provoca NumberFormatException
        } catch (ArithmeticException e) {
            System.out.println("Error de división por cero");
        } catch (NumberFormatException e) {
            e.printStackTrace(); // Muestra el rastro de la pila del error
        }
        System.out.println("La ejecución continúa");
    }
}