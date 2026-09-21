import java.math.BigInteger

fun main() {
    val bigNum= "12345123451234512345123451"
    // val toAdd = 99.toBigInteger();
    val toAdd = BigInteger.valueOf(99)
    var bigInt = bigNum.toBigInteger();
    bigInt+=toAdd;
    println("El resultado es ${bigInt}")
}
