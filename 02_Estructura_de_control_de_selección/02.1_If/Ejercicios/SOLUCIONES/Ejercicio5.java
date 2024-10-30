/*
Ejercicio 5: Evaluación de Nota

Enunciado: Completa el bloque `if-else if` para asignar una calificación basada en una puntuación.
Si la puntuación es mayor o igual a 90, imprime "A". Si es entre 80 y 89, imprime "B".
Si es entre 70 y 79, imprime "C". Si es menor de 70, imprime "F".
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int puntuacion = 76;
        if (puntuacion >= 90){
            System.out.println("A");
        } else if (puntuacion >= 80 && puntuacion <= 89) {
            System.out.println("B");
        } else if (puntuacion >= 70 && puntuacion <= 79) {
            System.out.println("C");
        } else  {
            System.out.println("F");
        }
    }
}