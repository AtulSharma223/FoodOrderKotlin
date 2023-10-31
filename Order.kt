import java.time.LocalDate

class Order : Customers() {
    // TODO Auto-generated method stub
    var d = AvailableDishes()
    var orderNo = 0
    var itemId = 0
    var quantity = 0
    var myObj = LocalDate.now()
    var ItemName: String? = null
    fun getData(orderNo: Int, itemId: Int, quantity: Int) {
        this.orderNo = orderNo
        this.itemId = itemId
        this.quantity = quantity
    }

    public override fun displayData() {
        println("Order is Display in the manner --> OrderId , ItemNo , ItemName , Quanity")
        println(orderNo.toString() + " " + itemId + " " + d.menu[itemId] + " " + quantity)
    }
}
