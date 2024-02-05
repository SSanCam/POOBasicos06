/**
 * Clase Cliente
 * @param nombre nombre del cliente
 * @param domicilio domicilio del cliente
 * @constructor Crea un cliente con nombre y domicilio
 */
data class Cliente(val nombre: String, var domicilio: Domicilio) {

    init {
        require(nombre.isNotBlank()) { "El campo nombre no debe estar en blanco." }
    }

    override fun toString(): String {
        return ("Cliente( nombre: $nombre, domicilio: $domicilio)")
    }
}