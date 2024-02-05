import kotlin.time.measureTime

fun main(){
    try{
        val repositorio = RepositorioCompra()
        // Agregar algunas compras al repositorio...
        repositorio.agregarCompra(Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 5, 12780.78))
        repositorio.agregarCompra(Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 7, 699.0))
        repositorio.agregarCompra(Compra(Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355)), 7, 532.90))
        repositorio.agregarCompra(Compra(Cliente("Julián Rodriguez", Domicilio("La Mancha", 761)), 12, 5715.99))
        repositorio.agregarCompra(Compra(Cliente("Jorge Russo", Domicilio("Mirasol", 218)), 15, 958.0))

// Obtener y mostrar los domicilios únicos
        val domiciliosUnicos = repositorio.domicilios()
        println("Domicilios a los cuales enviar factura de compra:")
        domiciliosUnicos.forEach { println(it) }
    }catch (e: IllegalArgumentException){
        println(e.message)
    }

}


