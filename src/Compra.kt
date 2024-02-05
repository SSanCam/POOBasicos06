/**
 * Clase Compra
 * @param cliente cliente que realizo la compra
 * @param dia dia de la compra
 * @param monto monto de la compra
 * @constructor Crea una compra con cliente, dia y monto
 */
data class Compra(var cliente: Cliente, var dia: Int , var monto: Double) {

    init {
        require(dia in 1..31) { "Los días deben estar comprendidos entre 1 y 31" }
    }
    override fun toString(): String {
        return ("Compra(Cliente: ${cliente}, dia: $dia, monto: $monto")
    }
}