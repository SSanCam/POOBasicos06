fun main() {
    val compra1 = Compra("Nuria", 5, 12780.78, "Calle Las Flores 355")
    val compra2 = Compra("Jorge Russo", 7, 699.0, "Mirasol 218")
    val compra3 = Compra("Nuria Costa", 7, 532.90, "Calle Las Flores 355")
    val compra4 = Compra("Julián Rodriguez", 12, 5715.99, "La Mancha 761")
    val compra5 = Compra("Jorge Russo", 15, 958.0, "Mirasol 218")

    val listadoClientes = listOf(compra1, compra2, compra3, compra4, compra5)
    val listadoDirecciones = listOf(compra1.direccion,compra2.direccion,compra3.direccion,compra4.direccion,compra5.direccion)
    println()
    println("Listado de facturas: \n")
    for (factura in listadoClientes){
        println(factura)
    }
    println()
    println("Direcciones de facturación: \n")
    for (direccion in listadoDirecciones){
        println(direccion)
    }

}
