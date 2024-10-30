/*
Ejercicio 2: Validación de String No Vacío

Enunciado: Completa el método `validarString` para usar `assert` y comprobar que la cadena no esté vacía.
Si la cadena está vacía, debe lanzar una `AssertionError` con el mensaje "El string no debe estar vacío".
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        validarString(""); // Este string está vacío
    }

    public static void validarString(String str) {
        if (str.length() == 0) {
            assert str.length() > 0 : "Debe de tener algo de contenido";// Completa aquí para lanzar la excepción con assert
            System.out.println(str);
        }
    }
}