package fundamentos

fun main(){
    val a = 1

    //num para string
    println(a.toString() + 1)

    //string para num
    println(a.toInt() + 2)

    println("Teste".toIntOrNull())
}