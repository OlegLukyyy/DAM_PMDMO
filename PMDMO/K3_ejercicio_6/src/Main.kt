fun sumValues(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber+secondNumber
}

fun sumValues(doubleValues: DoubleArray): Double{
    return doubleValues.sum()
}

fun sumValues(prefix:String, count : Int): String{
    var st: String=""
    for (i in 0..<count){
        st=st+prefix
    }
    return st
}
fun main(){
    println(sumValues("A-",3))
}