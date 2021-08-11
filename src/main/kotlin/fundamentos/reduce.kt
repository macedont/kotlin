package fundamentos

//reduce transforma uma coleção de valores em um único resultado
fun main(){
    var numeros = listOf(4, 5, 7, 9, 10, 8, 6, 3)

    //acc -> acumulador que é o resultado / value é o iterador
    var soma = numeros.reduce{acc, value -> acc + value}

    println("a média das notas é: ${soma / numeros.size}")
}