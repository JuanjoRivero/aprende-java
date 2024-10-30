/*
Ejercicio 1: Captura de Excepción Básica

Enunciado: Completa el bloque catch para capturar una excepción.
El código en el bloque try intenta realizar una división entre cero, lo cual provocará esta
excepción. Muestra en el catch el mensaje "Error: División entre cero".
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            int resultado = 45 / 0;
        }
        catch (Exception e) /*RELLENA EL PARENTESIS*/ {
            System.out.println("ERROR: Division entre cero");
        }
        System.out.println("La ejecución continúa");
    }
}