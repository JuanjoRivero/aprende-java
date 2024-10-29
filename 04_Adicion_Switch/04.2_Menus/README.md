# 04.1 Menús en Java con `switch`

En este apartado, aprenderemos cómo crear un menú interactivo utilizando la estructura `switch` en Java. Los menús son una herramienta común en programación para ofrecer opciones al usuario y ejecutar acciones basadas en la selección. Esto se logra de manera eficiente con `switch`, que evalúa el valor de una variable y ejecuta el bloque de código correspondiente.

### Pasos para Crear un Menú con `switch`

1. **Mostrar las Opciones al Usuario**: 
   Imprimimos en la consola las opciones disponibles para que el usuario pueda elegir.

2. **Leer la Elección del Usuario**:
   Utilizamos `Scanner` para capturar la entrada del usuario y almacenarla en una variable.

3. **Implementar el `switch`**:
   Usamos `switch` para evaluar la elección y ejecutar el código correspondiente a cada opción.

4. **Controlar la Salida del Menú**:
   Podemos incluir una opción de salida que permita al usuario finalizar el programa o salir del menú.

### Ejemplo de Código: Menú Básico con `switch`

En este ejemplo, crearemos un menú que permite al usuario seleccionar entre tres opciones:

- **Opción 1**: Mostrar un mensaje de bienvenida.
- **Opción 2**: Mostrar una información de contacto.
- **Opción 3**: Salir del programa.

```java
import java.util.Scanner;

public class MenuSwitchExample {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // 1. Mostrar el menú de opciones
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Mostrar mensaje de bienvenida");
            System.out.println("2. Mostrar información de contacto");
            System.out.println("3. Salir");

            // 2. Leer la elección del usuario
            int opcion = teclado.nextInt();

            // 3. Implementar el switch para ejecutar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("¡Bienvenido a nuestro programa!");
                    break;
                case 2:
                    System.out.println("Contacto: juanjoriverolorido@iescastelar.com");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    continuar = false; // Controla la salida del menú
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
```

### Explicación del Código

- **Bucle `while`**:
  - Mantenemos el menú en pantalla hasta que el usuario seleccione la opción de salir (`opcion == 3`).
  - La variable `continuar` se usa para controlar si el menú se repite.

- **Estructura `switch`**:
  - Cada `case` en el `switch` corresponde a una opción del menú.
  - Para cada opción válida, se ejecuta el código correspondiente y se usa `break` para salir de ese bloque de código.
  - Si el usuario elige una opción que no existe, se muestra un mensaje de “Opción inválida”.

- **Opción de Salida**:
  - La opción `3` cambia el valor de `continuar` a `false`, finalizando el bucle `while` y cerrando el programa.

### Notas Importantes

- **Validación de Entrada**: Si el usuario ingresa un valor que no es un número (por ejemplo, una letra), el programa podría lanzar una excepción. En aplicaciones más avanzadas, deberíamos manejar estas excepciones para evitar que el programa se cierre inesperadamente.
- **Menús Extensibles**: Puedes añadir más `case` al `switch` para incluir más opciones en el menú según sea necesario.