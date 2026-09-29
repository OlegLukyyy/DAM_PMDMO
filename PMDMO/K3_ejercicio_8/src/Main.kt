fun generateReport(
    reportTitle: String,
    startDate: String,
    endDate: String = "Today",
    detailedView: Boolean = true,
    watermarkText: String? = null
){
    println("${reportTitle},${startDate},${endDate},${detailedView},${watermarkText}")
}

fun main(){
    generateReport("Titulo","today", watermarkText = "copyright")
    generateReport(endDate = "copyright", startDate =  "Titulo", reportTitle = "today")
    generateReport("Book","today", detailedView = true)
}