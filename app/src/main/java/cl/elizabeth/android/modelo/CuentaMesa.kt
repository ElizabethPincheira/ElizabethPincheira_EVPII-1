package cl.elizabeth.android.modelo

class CuentaMesa(val mesa: Int) {

    private val _items: MutableList<ItemMesa> = mutableListOf()

    var aceptaPropina: Boolean = true

    fun agregarItem(itemMenu: ItemMenu, cantidad: Int) {
        val itemMesa = ItemMesa(itemMenu, cantidad) 
        _items.add(itemMesa) 
    }

    fun agregarItem(itemMesa: ItemMesa) {
        _items.add(itemMesa)
    }

    fun calcularTotalSinPropina(): Double {
        var total = 0.0
        for (item in _items) {
            total += item.calcularSubtotal() 
        }
        return total
    }

    fun calcularPropina(): Double {
        return calcularTotalSinPropina() * 0.10 
    }

    fun calcularTotalConPropina(): Double {
        return if (aceptaPropina) {
            calcularTotalSinPropina() + calcularPropina() 
        } else {
            calcularTotalSinPropina() 
        }
    }
}
