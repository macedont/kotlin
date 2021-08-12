package fundamentos

import kotlin.random.Random

/**
 * Crie uma lista com 100 inteiros aleatórios e imprima todos os  ímpares.
 */

fun main(){
    var num = List(100){ Random.nextInt(0, 100)}
    var impares = num.filter {it % 2 != 0}

    println(impares)
}