fun main(){
    var initialLetter:Char='K'
    var tab:Char='\t'
    var asciiCode:Int= initialLetter.code
    var codeForSymbol:Int = '$'.code

    // if (initialLetter==75){}
    // Se produce un errore debido a que char e int no son comparables en Kotlin
    print("$initialLetter , $tab , $asciiCode , $codeForSymbol")
}