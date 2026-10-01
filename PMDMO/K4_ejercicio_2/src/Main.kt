
fun main(){
    val age:Int =24
    when{
        age in 1..10 -> println("1..10")
        age in 11..20-> println("11..20")
        age in 21..30-> println("21..30")
        age in 31..40-> println("31..40")
        age in 41..59-> println("41..50")
    }
}


