package fundamentos

import kotlin.random.Random

/**
 * Crie uma lista de 50 inteiros aleatórios e calcule a média deles.
 */

fun main(){
    var numeros = List(50){ Random.nextInt(1, 100)}
    var soma = numeros.reduce { acc, i -> acc + i }

    println("A média de 50 números é: ${soma / numeros.size}")
}