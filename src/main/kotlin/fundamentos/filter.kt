package fundamentos

fun main(){
    var numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var pares = numeros.filter {it % 2 == 0}
    var maiorQueCinco = numeros.filter {x -> x > 5}

    println(maiorQueCinco)
    println(pares)
}