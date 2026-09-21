fun main() {

    val originalNumber: Number = 12345.678912345

    val valorDouble: Double = originalNumber.toDouble()
    val valorFloat: Float = originalNumber.toFloat()
    val valorInt: Int = originalNumber.toInt()

    println("Como Double: $valorDouble")
    println("Como Float:  $valorFloat")
    println("Como Int:    $valorInt")

    val intVueltoADouble: Double = valorInt.toDouble()
    val perdidaEnInt: Boolean = valorDouble != intVueltoADouble

    println("Valor original como Double: $valorDouble")
    println("De Int vuelto a Double:     $intVueltoADouble")

    val floatVueltoADouble: Double = valorFloat.toDouble()
    val perdidaEnFloat: Boolean = valorDouble != floatVueltoADouble

    println("Valor original como Double: $valorDouble")
    println("De Float vuelto a Double:   $floatVueltoADouble")

}