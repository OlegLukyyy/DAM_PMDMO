fun main() {
    println(validateValue(-1))
}

fun validateValue (inputNumber: Int): String{
    return if (inputNumber>0){
         "Value is positive"
    }else {
         throw IllegalArgumentException("Input must be greater than zero")
    }
}