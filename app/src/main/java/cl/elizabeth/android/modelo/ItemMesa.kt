package cl.elizabeth.android.modelo

class ItemMesa(itemMenu:ItemMenu, cantidad:Int) {
    fun calcularSubtotal():Double{
        val precio = itemMenu.precio.toDoubleOrNull() ?: 0.0 // Si no es un número válido, usamos 0.0
        return precio * cantidad
    }
}