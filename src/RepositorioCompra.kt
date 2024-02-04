/**
 * Clase RepositorioCompras
 * @constructor Crea un repositorio de compras
 */
class RepositorioCompra() {
    private val compras: MutableList<Compra> = mutableListOf()
    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    fun domicilios(): Set<Domicilio> {
        return (compras.map { it.cliente.domicilio }).toSet()
    }
}