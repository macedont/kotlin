package fundamentos

/**
 * Crie uma lista com 10 nomes a sua escolha e filtre todos os nomes que comecem com a letra B.
 */

fun main(){
    var nomes = listOf("Macedo", "Bruno", "Marcos", "Izael", "Joana", "Vitoria", "Bruna", "Marcos", "Bia", "Debora")
    var inicialB = nomes.filter{it.startsWith("B")}

    println(inicialB)
}