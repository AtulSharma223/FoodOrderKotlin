import java.time.LocalDate
import java.time.LocalTime

class GenerateBill internal constructor(typeOfCustomer: Int, id: Int, name: String, dishNo: Int, quantity: Int) {
    var dish = AvailableDishes()

    init {
        val total = (quantity * dish.price[dishNo]).toFloat()
        println("Yummy in the Tummy resturant")
        println("Phone num : 123456789")
        println()
        println("Customer name :- $name")
        println("Customer Id   :- $id")
        println("\nItem name     Quantity     Rate     Amount")
        println(dish.menu[dishNo] + "          " + quantity + "     " + "*" + "   " + dish.price[dishNo] + "       " + total + "₹")
        println("Delivery Charge                     80₹")
        println("Total Amount                        " + (total + 80))
        if (typeOfCustomer == 1) {
            println("Discount                            0/-")
            println("Total Amount Payable                " + (total + 80) + "₹")
        }
        if (typeOfCustomer == 2) {
            println("Discount                            30%")
            println("Total Amount Payable                " + (total + 80) * 0.7 + "₹")
        }
        if (typeOfCustomer == 3) {
            println("Discount                            30%")
            println("Extra Premium Discount              20%")
            println("Total Amount Payable                " + (total + 80) / 2 + "₹")
        }
        val date = LocalDate.now()
        val time = LocalTime.now()
        println("\nDate & time of Billing : $date $time")
    }
}
