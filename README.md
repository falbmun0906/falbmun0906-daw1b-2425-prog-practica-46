# Práctica 4.6: Prueba I

## Práctica de clase 1 - POO

Desarrolla un programa con las siguientes clases:

### Clase `Cafetera`

Atributos:
- `ubicacion` (nombre de la sala o habitación donde se encuentra).
- `capacidad` (la cantidad máxima de café que puede contener la cafetera).
- `cantidad` (la cantidad actual de café que hay en la cafetera).

Implementa, al menos, lo siguiente:

1. **Constructor primario**: Con la `ubicacion`. Establece la capacidad máxima en 1000 c.c. y la cantidad actual en 0 (cafetera vacía).
2. **Constructor secundario**: Con la `ubicacion` y la `capacidad` máxima de la cafetera. Inicializa la cantidad actual de café igual a la capacidad máxima.
3. **Constructor secundario**: Con la `ubicacion`, la `capacidad` máxima y la `cantidad` actual. Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
4. **Método `llenar()`**: Hace que la cantidad actual sea igual a la capacidad.
5. **Método `servirTaza(Taza)`**: Simula la acción de servir una taza con la capacidad que tenga la taza. Si la cafetera tiene café, llenará la taza y restará la cantidad servida en la cantidad de la cafetera. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. Actualiza la cantidad de la cafetera y aplica el método adecuado de la taza.
6. **Método `vaciar()`**: Pone la cantidad de café actual en cero.
7. **Método `agregarCafe(Int)`**: Añade a la cafetera la cantidad de café indicada. Por defecto añade 200 c.c. No se puede añadir más cantidad que su capacidad máxima, si ocurriera esta circunstancia, simplemente llenaríamos la cantidad de la cafetera a su capacidad máxima.
8. **Método `toString()`**: Retorna una cadena como `"Cafetera(ubicación = Salón, capacidad = 1000 c.c., cantidad = 0 c.c.)"`.

### Clase `Taza`

Atributos:
- `color`
- `capacidad`
- `cantidad`

Implementa, al menos, lo siguiente:

1. **Constructor**: Con el `color` (por defecto blanco) y la `capacidad` (por defecto 50 c.c.). La clase también contendrá un atributo con la cantidad que se establecerá a 0.
2. **Propiedad `cantidad`**: Debe modificarse para que si el valor que recibe es mayor que la capacidad de la taza, solo establezca el valor de dicha capacidad.
3. **Método `llenar()`**: Establece la cantidad de la taza a su máxima capacidad.
4. **Método `llenar(Int)`**: Establece la cantidad de la taza a la cantidad pasada como argumento al método.
5. **Método `toString()`**: Retorna una cadena como `"Taza(color = BLANCO, capacidad = 50 c.c., cantidad = 30 c.c.)"`.

### Clase enumerada `Color`

Contendrá los colores disponibles: `blanco`, `negro`, `gris`, `azul` y `verde`.

### Programa Principal

En el programa principal se deben crear 3 cafeteras de capacidad 1000, 750 y 500 c.c. con 0, 750 y 200 c.c de cantidad respectivamente. Para crear cada cafetera, debéis utilizar un constructor diferente. También debéis generar una lista de 20 tazas con la capacidad de 50, 75 y 100 de manera aleatoria. Implementar el resto de comentarios `TODO` de la función `main()`.

```kotlin
fun main() {

    //TODO: Crear 3 cafeteras en la Sala, Cocina y Oficina


    //TODO: Crear una lista de 20 tazas con capacidades aleatorias


    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.


    println("**********************************************")
    println("Llenar la cafetera1 de café...")
    println("Vaciar la cafetera2...")
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    println("Agregar 400 c.c. de café a la cafereta3...")

    //TODO: Llenar la cafetera1 de café.


    //TODO: Vaciar la cafetera2.


    //TODO: Agregar café a la cafetera2 a la mitad de su capacidad.


    //TODO: Agregar 400 c.c. de café a la cafereta3


    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras


    println("**********************************************")
    println("Servir café en las tazas...")

    //TODO: Servir café en las tazas... siempre que haya café en la cafetera y en el orden cafetera1, cafetera2 y cafetera3.


    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.


}