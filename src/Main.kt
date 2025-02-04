import kotlin.random.Random

fun crearTaza(): Taza {
    val capacidadesPosibles: List<Int> = listOf(50, 75, 100)

    return Taza(Color.entries.random(), capacidadesPosibles.random(), 0)
}

fun main() {

    //TODO: Crear 3 cafeteras en la Sala, Cocina y Oficina

    val cafeteras: List<Cafetera> = listOf(
        Cafetera("Sala", 1000, 0),
        Cafetera("Cocina", 750, 750),
        Cafetera("Oficina", 500, 200)
    )

    //TODO: Crear una lista de 20 tazas con capacidades aleatorias


    val tazas: MutableList<Taza> = mutableListOf()
    for (i in 0..20) {
        tazas.add(crearTaza())
    }

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.

    println("\nCAFETERAS: \n")
    for (cafetera in cafeteras) {
        println(cafetera)
    }

    println("\nTAZAS: \n")
    for (taza in tazas) {
        println(taza)
    }

    println("**********************************************")
    cafeteras[0].llenar()
    println(cafeteras[0])  // "Llenar la cafetera1 de café..."

    cafeteras[1].vaciar()
    println(cafeteras[1]) // "Vaciar la cafetera2..."

    cafeteras[1].agregarCafe(cafeteras[1].capacidad / 2) // "Agregar café a la cafetera2 a la mitad de su capacidad..."
    println(cafeteras[1])

    cafeteras[2].agregarCafe(400)
    println(cafeteras[2]) // "Agregar 400 c.c. de café a la cafereta3..."

    //TODO: Llenar la cafetera1 de café.

    cafeteras[0].llenar()
    println(cafeteras[0])

    //TODO: Vaciar la cafetera2.

    cafeteras[1].vaciar()
    println(cafeteras[1])

    //TODO: Agregar café a la cafetera2 a la mitad de su capacidad.

    cafeteras[1].agregarCafe(cafeteras[1].capacidad / 2)
    println(cafeteras[1])

    //TODO: Agregar 400 c.c. de café a la cafereta3

    cafeteras[2].agregarCafe(400)
    println(cafeteras[2]) // "Agregar 400 c.c. de café a la cafereta3..."

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras

    println("\nCAFETERAS: \n")
    for (cafetera in cafeteras) {
        println(cafetera)
    }

    println("**********************************************")
    println("Servir café en las tazas...")

    //TODO: Servir café en las tazas... siempre que haya café en la cafetera y en el orden cafetera1, cafetera2 y cafetera3.



    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.



}