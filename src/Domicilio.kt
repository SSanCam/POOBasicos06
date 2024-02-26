/**
 * Clase Domicilio
 * @property calle calle del domicilio
 * @property numero numero del domicilio
 * @constructor Crea un domicilio con calle y numero
 */
data class Domicilio (var calle: String, var numero: Int){

    init {
        require(calle.isNotBlank()) { "El campo 'calle' no debe estar en blanco." }
    }
    /**
     * Devuelve la dirección completa del domicilio en formato de cadena.
     * @return La dirección completa del domicilio.
     */
    fun dirCompleta(): String {
        return "$calle,$numero"
    }

    override fun toString(): String {
        return ("Domicilio(calle: $calle, numero: $numero)")
    }

}