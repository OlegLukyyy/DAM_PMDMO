fun main() {
    printTree(10)
}
fun printTree(n: Int){
    for (i in 1..n-1){

        for (j in 1..n-i-1){
            print(" ")
        }
        for (k in 1..2 * i - 1) {
            print("*")
        }

        println("")

    }
    for (j in 1..n - 3) {
        print(" ")
    }
    println("***")
}