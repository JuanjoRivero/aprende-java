/*
Ejercicio 2: Conversión de Cadenas y Uso de getMessage()

Enunciado: Completa el bloque catch para capturar una excepción.
El código en el bloque try intenta convertir la cadena "abc" en un número entero,
lo que generará esta excepción. Utiliza getMessage() dentro del catch para mostrar
el mensaje de error.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt("Texto"); // Provoca NumberFormatException
        }
        catch (Exception e) { // RELLENA EL PARENTESIS
            System.out.println(e.getMessage());
        }
        System.out.println("La ejecución continúa");
    }
}