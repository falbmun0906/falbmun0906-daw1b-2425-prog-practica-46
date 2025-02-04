class Taza(val color: Color = Color.blanco, val capacidad: Int = 50, var cantidad: Int = 0) {

    init {
        if (cantidad > capacidad) {
            cantidad = capacidad
        }
    }

    fun llenar() {
        cantidad = capacidad

    }

    fun llenar(medida: Int) {
        cantidad += medida
    }

    override fun toString(): String {
        return "Taza(color = $color, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}