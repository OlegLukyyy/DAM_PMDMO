fun main(){
    println(esPrimo(5))
}

fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    var i = 3
    while (i * i <= n) {
        if (n % i == 0) return false
        i += 2
    }
    return true
}