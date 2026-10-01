fun getConfigValue(configMap: Map<String,String>?,key: String):String?{
    return configMap?.get(key)
}
fun main() {
    
    val settings: Map<String, String>? = mapOf("Timeout" to "5000")
    val nullSettings:Map<String, String>?=null

    println(getConfigValue(settings,"Timeout"))
    println(getConfigValue(nullSettings,"A"))

}


