/**
 * Clase Cliente
 * @property nombre nombre del cliente
 * @property domicilio domicilio del cliente
 * @constructor Crea un cliente con nombre y domicilio
 */
data class Cliente(val nombre: String, var domicilio: Domicilio) {

    init {
        require(nombre.isNotBlank()) { "El campo nombre no debe estar en blanco." }
    }

    /**
     * Devuelve una representación de cadena de la instancia de Cliente.
     * @return Una cadena que representa al cliente, incluyendo su nombre y domicilio.
     */
    override fun toString(): String {
        return ("Cliente( nombre: $nombre, domicilio: $domicilio)")
    }
}