fun main(){
    analyzeScores(2,4,3)
    analyzeScores(2,2,3, sortAscending = false)
}
fun analyzeScores(
    minThreshold: Int,
    vararg scores: Int,
    sortAscending: Boolean=true
){
    println(minThreshold)
    scores.forEach {element-> println(element) }
}