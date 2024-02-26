/**
 * Clase Compra
 * @property cliente cliente que realizo la compra
 * @property dia dia de la compra
 * @property monto monto de la compra
 * @constructor Crea una compra con cliente, dia y monto
 */
data class Compra(var cliente: Cliente, var dia: Int , var monto: Double) {

    init {
        require(dia in 1..31) { "Los días deben estar comprendidos entre 1 y 31" }
    }

    /**
     * Devuelve una representación de cadena de la instancia de Compra.
     * @return una cadena que representa la compra, incluyendo los detalles del cliente, día y monto.
     */
    override fun toString(): String {
        return ("Compra(Cliente: ${cliente}, dia: $dia, monto: $monto")
    }
}