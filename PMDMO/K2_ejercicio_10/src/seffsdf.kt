import kotlin.random.Random

fun main(){
    var unknown:Any?
    val random = Random.nextInt(0,100)

     when (random){
        in 0..33-> {
            unknown = null
            println("La variable es nula")
        }
        in 34..66 -> {
            unknown =5
            println("La variable es un número entero")
        }
        else -> {
            unknown ="Baldomero"
            println("La variable es una cadena de texto")
        }
    }

}