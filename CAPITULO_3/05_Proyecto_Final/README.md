### Proyecto: Sistema Básico de Inventario

Imagina que una tienda pequeña necesita ayuda para gestionar su inventario de productos y te ha pedido crear un sistema en Java para ello. El programa debe permitirle al usuario interactuar con el inventario desde un menú. A continuación, se indican las acciones necesarias, aunque algunas pueden ser opcionales o incluirse según lo veas conveniente.

El sistema debe incluir:
1. **Manejo de productos**: Crea una clase que represente un producto en el inventario. Define atributos como el nombre, la cantidad y el precio de cada producto. Este sistema debería ser capaz de:
   - Almacenar una lista de productos.
   - Poder crear objetos con un método.
   - Agregar y actualizar.
   - Realizar validaciones para asegurar que tanto la cantidad como el precio sean siempre positivos.
   - Manejar casos en que se intente acceder a productos no registrados.

2. **Manejo de excepciones**: Desarrolla una estructura que capture y maneje errores, como valores inválidos, entradas incorrectas, o productos inexistentes. Implementa al menos una excepción personalizada para la clase de producto.

3. **Estructura del menú**: El programa debe mostrar un menú interactivo con opciones para cada funcionalidad. Usa estructuras de control para que el menú se repita hasta que el usuario decida salir.

4. **Validación y aserciones**: Utiliza `assert` para garantizar que el inventario mantenga su integridad en todo momento. Por ejemplo, un producto no debería tener una cantidad o precio negativos en ningún momento.

### Indicaciones de Métodos

Define al menos los siguientes métodos en tu clase de inventario. Los nombres son sugeridos, pero los parámetros indicados son requeridos:

- `agregarProducto(Producto producto)`: Este método debe agregar un producto al inventario. Asegúrate de validar que el producto no exista previamente.
  
- `actualizarCantidad(String nombre, int nuevaCantidad)`: Este método debe buscar un producto por su nombre y actualizar su cantidad. Si la cantidad es negativa o el producto no existe, lanza una excepción.

### Extras

Si deseas ir un paso más allá, considera implementar una opción para buscar un producto por nombre, y otra para mostrar todos los productos con sus detalles en una lista detallada del inventario.
