/*
Ejercicio 3: Validación de Edad

Enunciado: Completa el método `validarEdad` para usar `assert` y comprobar que la edad sea al menos 18 años.
Si la edad es menor, debe lanzar una `AssertionError` con el mensaje "La edad debe ser al menos 18 años".
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        validarEdad(16); // Este valor es menor de 18
    }

    public static void validarEdad(int edad) {
        assert edad >= 18 : "La edad debe ser al menos 18 años";// Completa aquí para lanzar la excepción con assert
        System.out.println(edad);
    }
}