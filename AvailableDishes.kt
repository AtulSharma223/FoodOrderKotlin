class AvailableDishes internal constructor() {
    var menu = arrayOfNulls<String>(100)
    var price = IntArray(100)
    var count = 10

    init {
        menu[1] = "Pizza"
        price[1] = 120
        menu[2] = "Burger"
        price[2] = 50
        menu[3] = "Dosha"
        price[3] = 140
        menu[4] = "Biryani"
        price[4] = 150
        menu[5] = "Hot Dog"
        price[5] = 80
        menu[6] = "Noodle"
        price[6] = 150
        menu[7] = "Pasta"
        price[7] = 100
        menu[8] = "Donuts"
        price[8] = 70
        menu[9] = "Sandwich"
        price[9] = 160
    }

    fun addDish(name: String?, price: Int) {
        menu[count] = name
        this.price[count] = price
        count++
    }

    fun displayData() {
        println()
        println("Our Available Dishes are ")
        for (i in 1 until count) {
            println(i.toString() + " " + menu[i] + " " + price[i])
        }
    }
}
