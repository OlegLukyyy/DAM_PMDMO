fun main(){
    
    println("Introduce 4 notas")
    val marksArray: DoubleArray = DoubleArray(4,{i -> readln().toDouble()})
    
    
    var sum: Double= 0.0
    marksArray.forEach { mark-> sum+=mark }
    print(sum/4)
    

}