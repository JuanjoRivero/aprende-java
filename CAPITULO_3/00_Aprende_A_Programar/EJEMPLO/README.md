# Ejercicio: Control de una Cafetera con Gestor

**Objetivo**: Crear una aplicación básica que simule una cafetera, controlada a través de un gestor que permita interactuar con el usuario. La aplicación debe permitir llenar la cafetera, servir una taza si hay café disponible y consultar la cantidad de café restante.

## 1. Planteamiento del Problema

Queremos simular el funcionamiento de una cafetera a través de un programa que permita interactuar con ella. El programa debe:
- Llenar la cafetera a su capacidad máxima.
- Servir una cantidad de café específica (solo si hay suficiente).
- Consultar cuánta cantidad de café queda.

## 2. Identificación de Clases y Objetos

Para organizar este programa, definiremos dos clases:
- **Clase `Cafetera`**: Encargada de almacenar la cantidad de café y realizar las operaciones básicas de la cafetera.
- **Clase `GestorDeCafetera`**: Encargada de interactuar con el usuario y gestionar las operaciones de la cafetera.

## 3. Definición de Atributos y Métodos

- **Clase `Cafetera`**:
  - **Atributo**:
    - `cantidadCafe`: Indica la cantidad de café en la cafetera.
  - **Métodos**:
    - `llenarCafetera()`: Llena la cafetera a su capacidad máxima de 500 ml.
    - `servirTaza(int cantidad)`: Sirve la cantidad de café especificada, si hay suficiente.
    - `getCantidadCafe()`: Devuelve la cantidad de café restante.

- **Clase `GestorDeCafetera`**:
  - **Atributos (en este caso son objetos)**:
    - `cafetera`: Objeto de la clase `Cafetera`.
    - `scanner`: Objeto `Scanner` para leer la entrada del usuario.
  - **Método**:
    - `iniciar()`: Muestra un menú de opciones y permite al usuario interactuar con la cafetera.

## 4. Estructura en Código

### Código Java

```java
import java.util.Scanner;

// Clase Cafetera que representa una cafetera básica
class Cafetera {
    private int cantidadCafe;

    // Constructor que inicia la cafetera vacía
    public Cafetera() {
        this.cantidadCafe = 0;
    }

    // Método para llenar la cafetera a su capacidad máxima
    public void llenarCafetera() {
        cantidadCafe = 500;
        System.out.println("La cafetera se ha llenado a 500 ml.");
    }

    // Método para servir una taza de café si hay suficiente café
    public void servirTaza(int cantidad) {
        if (cantidad <= cantidadCafe) {
            cantidadCafe -= cantidad;
            System.out.println("Se ha servido una taza de " + cantidad + " ml.");
        } else {
            System.out.println("No hay suficiente café para servir esa cantidad.");
        }
    }

    // Método para mostrar la cantidad de café restante
    public int getCantidadCafe() {
        return cantidadCafe;
    }
}

// Clase GestorDeCafetera que maneja la interacción con el usuario y gestiona el flujo del programa
class GestorDeCafetera {
    private Cafetera cafetera;
    private Scanner scanner;

    // Constructor que crea una cafetera y un scanner para la interacción
    public GestorDeCafetera() {
        this.cafetera = new Cafetera();
        this.scanner = new Scanner(System.in);
    }

    // Método para mostrar el menú de opciones y gestionar las interacciones
    public void iniciar() {
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Llenar la cafetera");
            System.out.println("2. Servir una taza de café");
            System.out.println("3. Mostrar cantidad de café restante");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de café para la taza (en ml): ");
                    int cantidad = scanner.nextInt();
                    cafetera.servirTaza(cantidad);
                    break;
                case 3:
                    System.out.println("Café restante: " + cafetera.getCantidadCafe() + " ml.");
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }

        scanner.close();
    }
}

// Clase principal que crea una instancia de GestorDeCafetera y lo inicia
public class Main {
    public static void main(String[] args) {
        GestorDeCafetera gestor = new GestorDeCafetera();
        gestor.iniciar();
    }
}
```


### Explicación del Código
---
1. **Clase `Cafetera`**:
   - **Atributo `cantidadCafe`**: Almacena la cantidad de café disponible.
   - **Métodos**:
     - `llenarCafetera()`: Llena la cafetera a su capacidad máxima de 500 ml.
     - `servirTaza(int cantidad)`: Reduce `cantidadCafe` en la cantidad solicitada si hay suficiente.
     - `getCantidadCafe()`: Devuelve la cantidad de café restante.

2. **Clase `GestorDeCafetera`**:
   - Crea una instancia de `Cafetera` y un objeto `Scanner` para la entrada del usuario.
   - **Método `iniciar()`**: Presenta un menú y permite al usuario seleccionar opciones que interactúan con la cafetera.

3. **Clase `Main`**:
   - Crea una instancia de `GestorDeCafetera` y llama al método `iniciar()` para ejecutar el programa.
