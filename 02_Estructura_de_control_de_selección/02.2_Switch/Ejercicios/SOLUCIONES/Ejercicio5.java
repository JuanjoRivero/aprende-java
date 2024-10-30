/*
Ejercicio 5: Clasificación de Frutas con Switch

Enunciado: Completa el bloque `if` para verificar si el número de fruta está en el rango válido
(1 a 4). Si es válido, utiliza un `switch` para almacenar el color de la fruta en
una variable `colorFruta`. 1 = Manzana (Rojo), 2 = Plátano (Amarillo),
3 = Uva (Morado), 4 = Naranja (Naranja). Si el número no coincide con ninguna fruta,
almacena "Fruta no válida". Finalmente, imprime el valor de `colorFruta`.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int fruta = 3; // Cambia este valor para probar
        String colorFruta = ""; // Variable para almacenar el color de la fruta

        if (fruta >= 1 && fruta <= 4) {
            switch (fruta) {
                case 1:
                    colorFruta = "Rojo"; // Manzana
                    break;
                case 2:
                    colorFruta = "Amarillo"; // Plátano
                    break;
                case 3:
                    colorFruta = "Morado"; // Uva
                    break;
                case 4:
                    colorFruta = "Naranja"; // Naranja
                    break;
            }
        } else {
            colorFruta = "Fruta no válida";
        }

        System.out.println(colorFruta);
    }
}