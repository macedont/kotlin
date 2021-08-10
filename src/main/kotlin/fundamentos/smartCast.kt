package fundamentos

fun esperto(x: Any){
    if(x is String){
        println(x.toUpperCase())
    }else if(x is Int){
        println(x.plus(3))
    }
}

fun esperto1(y: Any){
    when(y){
        is String -> println(y.toLowerCase())
        is Int -> println(y.dec())
        else -> println("algo de errado n está certo")
    }
}


fun main(){
    esperto(3)
    esperto1(1.99)
}