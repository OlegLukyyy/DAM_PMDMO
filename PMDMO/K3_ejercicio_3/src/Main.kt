fun printWelcomeMessage(user: String){
    println("Hola ${user}!!")
}
fun logActivity(){
    println("Activity logged")
}
fun main(){
    val resultOne= printWelcomeMessage("Paco")
    val resultTwo= logActivity()
    println("${resultOne} ${resultTwo}")
}