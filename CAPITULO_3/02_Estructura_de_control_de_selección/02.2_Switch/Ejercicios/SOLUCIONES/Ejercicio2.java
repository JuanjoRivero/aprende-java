/*
Ejercicio 2: Evaluación de Calificación

Enunciado: Completa el bloque `switch` para imprimir la calificación correspondiente a una letra.
Si la letra es 'A', imprime "Excelente". Si es 'B', imprime "Bueno". Si es 'C', imprime "Regular".
Si es 'D', imprime "Deficiente". Si no coincide con ninguna de estas, imprime "Calificación no válida".
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        char calificacion = 'B';
        switch (calificacion) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bueno");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            case 'D':
                System.out.println("Deficiente");
                break;
            default:
                System.out.println("Calificación no válida");
                break;
        }

    }
}