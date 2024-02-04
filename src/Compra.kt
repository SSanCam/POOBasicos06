class Compra(cliente: String, dia: Int, monto: Double, direccion: String) {

    var cliente: String = ""
        get() = cliente
        set(value) {
            require(cliente.isNotBlank()) { "El campo 'nombre' no puede quedar en blanco." }
            field = cliente
        }
}