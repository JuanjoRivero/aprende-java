/*
Ejercicio 1: Estructura `switch` Básica

Enunciado: Completa el bloque `switch` para imprimir el nombre del día de la semana
correspondiente a un número del 1 al 7. Si el número no está en ese rango, debe imprimir "Número no válido".
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido");
                break;
        }

    }
}