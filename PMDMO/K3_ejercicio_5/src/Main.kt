fun isLeapYear(year: Int){
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        println("Es bisiesto")
    }else{
        println("No es bisiesto")
    }
}
fun  main(){
    isLeapYear(2020)
    isLeapYear(2021)
}