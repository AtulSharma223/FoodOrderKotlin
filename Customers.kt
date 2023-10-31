open class Customers {
    // TODO Auto-generated method stub
    var orderNumber = 0
    var phoneNo = 0
    var customerCount = 0
    var name: String? = null
    var address: String? = null
    var emailId: String? = null
    var dishNumber = 0

    internal constructor()
    internal constructor(
        orderNumber: Int,
        phoneNo: Int,
        name: String?,
        dishNumber: Int,
        address: String?,
        emailId: String?
    ) {
        this.orderNumber = orderNumber
        this.phoneNo = phoneNo
        this.name = name
        this.address = address
        this.emailId = emailId
        this.dishNumber = dishNumber
    }

    fun getData(orderNumber: Int, phoneNo: Int, name: String?, dishNumber: Int, address: String?, emailId: String?) {
        this.orderNumber = orderNumber
        this.phoneNo = phoneNo
        this.name = name
        this.address = address
        this.emailId = emailId
        this.dishNumber = dishNumber
    }

    open fun displayData() {
        print("Detail of customer is : ")
        println("$orderNumber $phoneNo $name $dishNumber $address $emailId")
    }
}
