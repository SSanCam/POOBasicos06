/**
 * Clase RepositorioCompras
 * @constructor Crea un repositorio de compras
 */
class RepositorioCompra() {
    private val compras: MutableList<Compra> = mutableListOf()

    /**
     * Agrega una compra al repositorio.
     * @param compra La compra a agregar.
     */
    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    /**
     * Devuelve un conjunto de domicilios únicos de los clientes que realizaron compras.
     * @return Un conjunto de domicilios de clientes.
     */
    fun domicilios(): Set<Domicilio> {
        return (compras.map { it.cliente.domicilio }).toSet()
    }
}