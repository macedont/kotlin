package fundamentos

fun main(){
    var numeros = listOf(1, 2, 3, 4, 5)
    var produto = numeros.map{ it * 2 }

    println(produto)
}