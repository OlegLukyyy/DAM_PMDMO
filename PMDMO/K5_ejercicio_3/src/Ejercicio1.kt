fun formatName (firstName:String, lastName:String?, nickname: String?): String{
    return nickname?:"${firstName} ${lastName}"
}
fun main (){

println(formatName("Hola","Ho","La") )
println(formatName("Hola",null,"La") )
println(formatName("Hola","Ho",null) )
println(formatName("Hola",null,null) )

}