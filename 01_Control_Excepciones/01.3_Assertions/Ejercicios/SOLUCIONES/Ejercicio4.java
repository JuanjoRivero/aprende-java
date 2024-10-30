/*
Ejercicio 4: Validación de Valor dentro de un Rango

Enunciado: Completa el método `validarRango` para usar `assert` y comprobar que el número esté dentro del rango de 1 a 100 (inclusive).
Si el número está fuera de este rango, debe lanzar una `AssertionError` con el mensaje "El número debe estar entre 1 y 100".
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        validarRango(150); // Este número está fuera del rango
    }

    public static void validarRango(int numero) {
        assert numero > 0 && numero < 101 : "El numero debe estar entre 1 y 100";// Completa aquí para lanzar la excepción con assert
        System.out.println(numero);
    }
}