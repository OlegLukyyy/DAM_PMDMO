fun main() {
    println(getNameLength("Developer"))
    println(getNameLength(null))
}

fun getNameLength (userName :String?): Int{
     if(userName==null){
        return 0
    }else{
        return userName.length
    }

}