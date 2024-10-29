# 00_Aprende_A_Programar
---

En este apartado, aprenderás los fundamentos de cómo planear la programación de un ejercicio utilizando conceptos básicos de la Programación Orientada a Objetos (POO). También veremos algunas estrategias para detectar y corregir errores comunes que pueden surgir al compilar el código.

## Índice
1. [Planificación Básica en Programación Orientada a Objetos](#1-planificación-básica-en-programación-orientada-a-objetos)
2. [Resolución de Errores y Compilación](#2-resolución-de-errores-y-compilación)

### 1. Planificación Básica en Programación Orientada a Objetos
---

Para abordar un ejercicio en POO, sigue estos pasos básicos de planificación:

1. **Analiza el Problema**: Define claramente qué quieres que haga el programa. Divide el problema en pequeños componentes que sean fáciles de manejar.
   
2. **Identifica las Clases y Objetos**:
   - **Clase**: Representa una categoría o un tipo de objeto (por ejemplo, `Coche`, `Libro`).
   - **Objeto**: Es una instancia de una clase (por ejemplo, `miCoche` es un objeto de la clase `Coche`).

3. **Define los Atributos y Métodos**:
   - **Atributos**: Son las propiedades de una clase (por ejemplo, `color` o `velocidad` para `Coche`).
   - **Métodos**: Son las funciones que realizan acciones específicas (por ejemplo, `acelerar()` para `Coche`).

4. **Planifica la Interacción entre Objetos**: Define cómo interactuarán los objetos de distintas clases. ¿Un objeto necesita conocer el estado de otro? Esto puede llevarte a definir relaciones entre clases.

5. **Implementa y Revisa Incrementalmente**: Empieza codificando las clases y métodos básicos, y luego ve agregando más funcionalidades conforme sea necesario.

### 2. Resolución de Errores y Compilación
---

La detección y resolución de errores es una parte fundamental de la programación. Aquí tienes algunos consejos para gestionar errores:

1. **Errores de Compilación**:
   - Estos errores suelen ocurrir cuando el código tiene errores de sintaxis o usa estructuras incorrectas.
   - Usa los mensajes del compilador para localizar y entender el error.
   - **Ejemplos comunes**: falta de punto y coma, variables no definidas, o tipos incorrectos.

2. **Errores en Tiempo de Ejecución**:
   - Estos errores ocurren cuando el código compila, pero falla al ejecutarse debido a problemas como divisiones por cero, índices fuera de rango, etc.
   - Utiliza bloques `try-catch` para capturar excepciones y manejar los errores sin interrumpir la ejecución del programa.

3. **Estrategias para Detectar y Arreglar Errores**:
   - **Impresión de Valores**: Usa `System.out.println()` en puntos clave para verificar el estado de las variables y el flujo del programa.
   - **Depurador (Debugger)**: Herramienta muy útil en IDEs como IntelliJ o Eclipse para inspeccionar el estado del programa paso a paso.
   - **Dividir el Código en Partes**: Si el código es extenso, prueba y depura cada sección de manera independiente.

4. **Pruebas Unitarias**:
   - Implementa pruebas para cada método importante de tu programa. Esto facilita la detección de errores y asegura que el código funcione correctamente en diferentes casos.

### Ejemplo Básico de Captura de Errores en Java

```java
try {
    int resultado = 10 / 0; // Genera una ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Error: No se puede dividir entre cero.");
}