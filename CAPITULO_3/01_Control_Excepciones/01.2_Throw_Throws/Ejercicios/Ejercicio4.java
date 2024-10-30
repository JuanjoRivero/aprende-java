/*
Ejercicio 4: Captura de Múltiples Excepciones

Enunciado: Completa los bloques catch para manejar dos tipos de excepciones.
El método "probarExcepciones" lanza IllegalArgumentException para edades
menores de 18 y ArithmeticException para divisiones por cero. Captura
cada excepción y muestra un mensaje diferente para cada una.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            probarExcepciones(16, 0); // -> Provoca IllegalArgumentException y ArithmeticException
        } catch () { // RELLENA EL PARENTESIS
            // Completa aquí para capturar IllegalArgumentException y mostrar el mensaje de error
        } catch () { // RELLENA EL PARENTESIS
            // Completa aquí para capturar ArithmeticException y mostrar el mensaje de error
        }
        System.out.println("La ejecución continúa");
    }

    public static void probarExcepciones(int edad, int divisor) {
        if () { //Completa el parentesis
            // Completa aquí para lanzar IllegalArgumentException
        }
        if () { //Completa el parentesis
            // Completa aquí para lanzar ArithmeticException
        }
    }
}
