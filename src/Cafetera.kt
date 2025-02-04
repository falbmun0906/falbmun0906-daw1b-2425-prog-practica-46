class Cafetera(val ubicacion: String) {

    var cantidad: Int = 0
        private set

    var capacidad: Int = 1000

    constructor(ubicacion: String, capacidad: Int) : this(ubicacion)  {
        this.capacidad = capacidad
        this.cantidad = cantidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int) : this(ubicacion, capacidad) {
        if (cantidad > capacidad) {
            this.cantidad = capacidad
        }
        this.cantidad = cantidad
    }

    fun llenar() {
        cantidad = capacidad
    }

    fun servirTaza(taza: Taza) {
        val cantidadAServir: Int = taza.capacidad - taza.cantidad

        if (cantidad > (cantidadAServir)) {
            taza.llenar()
            cantidad -= cantidadAServir
        } else {
            taza.llenar(cantidad)
            cantidad = 0
        }
    }

    fun vaciar() {
        cantidad = 0
    }

    fun agregarCafe(medida: Int = 200) {
        if (capacidad <= cantidad + medida) {
            capacidad += medida
        } else cantidad = capacidad
    }

    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = $capacidad c.c., cantidad = $cantidad c.c.)"
    }
}