fun calculateDiscount (orderTotal: Double,isLoyalCustomer: Boolean): String {
    return when (orderTotal) {
        in 0.0..10.0 -> "No Discount"
        in 10.0..50.0 if isLoyalCustomer -> "5% loyal customer"
        else if orderTotal < 100.0 -> "10% standart discount"
        else -> "20% discount"
    }

}


fun main() {
    println(calculateDiscount(10.23,true))

}