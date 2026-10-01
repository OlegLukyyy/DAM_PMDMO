fun main() {
 calculateSquareRoot(3.5)
}

fun calculateSquareRoot(number: Double): String{
    if (number<0){
        throw IllegalArgumentException("El numero no puede ser negativo")
    }
    return "La raiz cuadrada del ${number} es ${number*number}"
}