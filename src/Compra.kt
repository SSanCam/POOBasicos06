class Compra(cliente: String, dia: Int, monto: Double, direccion: String) {

    var cliente: String = cliente
        set(value) {
            require(cliente.isNotBlank()) { "El campo 'nombre' no puede quedar en blanco." }
            field = value
        }

    var dia: Int = dia
        set(value) {
            require(dia in 1..31){ "Día debe tener un valor entre 1 y 31." }
            field = value
        }


    var monto: Double = monto

    var direccion: String = direccion

    override fun toString(): String {
        return ("Cliente: ${cliente}, dia: $dia, monto: $monto, dirección: $direccion ")
    }
}