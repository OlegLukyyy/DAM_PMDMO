fun main(){
    var closedRange = 10..15;
    println(closedRange)
    println(closedRange.toList())


    var openRange = 'A'..<'D';
    for (num in openRange){
        println(num)
    }

    var evenProgression = 20 downTo 10 step 2
    for (num in evenProgression){
        println(num)
    }

    var isInRange = closedRange.contains(12)
    println(isInRange)
}