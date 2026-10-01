fun main() {
    printTre(10)
}
fun printTre(n: Int){

    repeat(n) {i->

        repeat(n-1-i){
            print(" ")
        }
        repeat(i*2-1){
            print("*")
        }
        println()
    }
    repeat(n-3){
        print(" ")
    }
    print("***")
}