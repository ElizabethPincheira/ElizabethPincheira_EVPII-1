package cl.elizabeth.android.modelo

class ItemMenu(val nombre: String, val precio: String) {
    // Conversión del precio de String a Double
    fun obtenerPrecio(): Double {
        return precio.toDoubleOrNull() ?: 0.0
    }
}

