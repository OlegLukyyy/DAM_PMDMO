fun calculateMetrics(
    dataList: List<Int>,
    includeAverage: Boolean,
    precisionDigits: Int,
) {
    println(dataList)
    println(includeAverage)
    println(precisionDigits)
}

fun main() {
    calculateMetrics(
        listOf(1, 2, 3),
        true,
        2,
    )
}