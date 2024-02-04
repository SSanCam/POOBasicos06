/**
 * Clase Domicilio
 * @param calle calle del domicilio
 * @param numero numero del domicilio
 * @constructor Crea un domicilio con calle y numero
 */
data class Domicilio (var calle: String, var numero: Int){
    override fun toString(): String {
        return ("Domicilio(calle: $calle, numero: $numero)")
    }

    fun dirCompleta(): String {
        return "$calle,$numero"
    }
}