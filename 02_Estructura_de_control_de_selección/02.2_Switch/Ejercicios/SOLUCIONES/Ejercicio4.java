/*
Ejercicio 4: Evaluación de Estaciones

Enunciado: Completa el bloque `switch` para almacenar la estación del año correspondiente
a un número del 1 al 4 en una variable `estacionNombre`. 1 = Primavera, 2 = Verano,
3 = Otoño, 4 = Invierno. Si el número no está en ese rango, debe almacenar "Estación no válida".
Finalmente, imprime el valor de `estacionNombre`.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int estacion = 2; // Cambia este valor para probar
        String estacionNombre = "";

        switch (estacion) {
            case 1:
                estacionNombre = "Primavera";
                break;
            case 2:
                estacionNombre = "Verano";
                break;
            case 3:
                estacionNombre = "Otoño";
                break;
            case 4:
                estacionNombre = "Invierno";
                break;
            default:
                estacionNombre = "Estación no válida";
                break;
        }

        System.out.println(estacionNombre);
    }
}