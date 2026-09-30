fun calculateAverage (vararg numbers:Int):Int{
    var sum=0
    for (number in numbers) {
        sum += number;
    }
    return sum/numbers.size
}

fun main(){
    val numbers:IntArray = intArrayOf(1,2,3,4)

    print(calculateAverage(*numbers))
}
