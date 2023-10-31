import java.util.*

object Yummy_In_The_Tummy {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        //Available dishes.
        while (true) {
            val menu1 = AvailableDishes()
            //menu1.addDish("PowBaji", 180);		
            menu1.displayData()
            println()
            var id: Int
            var phn: Int
            var dishNo: Int
            var name: String?
            var address: String?
            var email: String?
            println("Enter details -->  OrderNO , Phno , DishNo , Name , Address , Email")
            id = sc.nextInt()
            phn = sc.nextInt()
            dishNo = sc.nextInt()
            name = sc.next()
            address = sc.next()
            email = sc.next()
            val c1 = Customers(id, phn, name, dishNo, address, email)
            c1.displayData()
            println()
            val order1 = Order()
            print("Enter Quantity ")
            var quantity: Int
            quantity = sc.nextInt()
            order1.getData(id, dishNo, quantity)
            order1.displayData()
            println()
            var typeOfCustomer: Int
            println("Enter \n1 for guest \n2 for Regular Customer \n3 for Premium members")
            typeOfCustomer = sc.nextInt()
            val bill = GenerateBill(typeOfCustomer, id, name, dishNo, quantity)
            print("\nPress 1 for Enter next Customer Details\nPress 2 for exit \n")
            val choice = sc.nextInt()
            if (choice == 2) break
        }
    }
}
