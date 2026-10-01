import kotlin.require

fun main() {
    println(getValidAge("25"))
    println(getValidAge("abc"))
    println(getValidAge("200"))
    

}
fun getValidAge(ageString :String ):Int{
    try {
        val age: Int = ageString.toInt()
        require(age in 1..120)
        return age
    }catch (e : NumberFormatException){
        return 0

    }catch (e: IllegalArgumentException){
        return -1
    }

}