fun main(){
    val str = getString()

    for (char in str){
        print("$char ")
        if (isALetter(char)){
            println("es una letra ${if (char.isUpperCase()) "mayúscula." else "minúscula."}")
        }else{
            println("no es una letra")
        }
    }

    var firstName = "Alan"
    var lastName= "Turing"
    var yearOfBirth=1912
    var fullName=firstName + " " + lastName
    var firstChar=fullName[0]
    println(firstChar)
    var isSameName= firstName == "Alan"
    println(isSameName)
    var biography="""
            |Full Name: $fullName. 
            |Year: $yearOfBirth. 
            |The first letter is: $firstChar.
            """.trimMargin()
    print(biography)
}

fun getString() = readln()

fun isALetter(char: Char): Boolean{
    if (char.code in 'A'.code..'Z'.code || char.code in 'a'.code..'z'.code){
        return true
    }
    return false
}
