/**
 * Clase Compra
 * @param cliente cliente que realizo la compra
 * @param dia dia de la compra
 * @param monto monto de la compra
 * @constructor Crea una compra con cliente, dia y monto
 */
data class Compra(var cliente: Cliente, var dia: Int , var monto: Double) {

    override fun toString(): String {
        return ("Compra(Cliente: ${cliente}, dia: $dia, monto: $monto")
    }
}