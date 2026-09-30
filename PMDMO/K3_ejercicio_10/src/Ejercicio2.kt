fun main(){
    val initialSet: IntArray = intArrayOf(10, 20, 30)
    val extraSet: IntArray=intArrayOf(40,50)
    combineData(*initialSet,*extraSet)

}
fun combineData(vararg dataChunks:Int){
    for (data in dataChunks){
        println(data)
    }

}