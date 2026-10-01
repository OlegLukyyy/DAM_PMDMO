import kotlin.random.Random

fun main() {
    var randomNumber = Random.nextInt(100)
    var answer=-1
    var guessed=false

    while (!guessed){
        println("Adivina el numero aleatorio del 1 al 100")
        answer=readln().toInt()
        if (answer == randomNumber){
            guessed= true
            println("Correcto")
        }else{
            if (answer<randomNumber){
                println("El numero es mayor")
            }else{
                println("El numero es menor")
            }
        }
    }
}