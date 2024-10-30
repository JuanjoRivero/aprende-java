/*
Ejercicio 3: Uso de finally para Recursos de Limpieza

Enunciado: Completa el bloque catch y el bloque finally.
En el bloque catch, captura una ArrayIndexOutOfBoundsException y muestra
el mensaje "Error: Índice fuera de rango". En el bloque finally, muestra
el mensaje "Proceso terminado".
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Provoca ArrayIndexOutOfBoundsException porque solo existen los huecos del 0 al 2
        }
        catch (Exception e) { // RELLENA EL PARENTESIS
            System.out.println("Error: Índice fuera de rango");
        }
        finally {
            System.out.println("Proceso terminado");
        }
    }
}
