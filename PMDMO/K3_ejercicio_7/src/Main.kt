fun configurePrintJob(
    fileName: String,
    pageSize: Int=200,
    isColorMode:Boolean=false
){
println("${fileName},${pageSize},${isColorMode}")
}

fun main(){
    configurePrintJob("Book")
    configurePrintJob("Book", 100)
    configurePrintJob("Book", isColorMode = true)
}