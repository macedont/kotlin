package fundamentos

import kotlin.random.Random

/**
 * Crie uma lista com 100 Doubles aleatórios e calcule a raiz quadrada de todos eles.
 */

fun main(){
    var numeros = List(100){ Random.nextDouble(0.0, 100.0)}
    var raiz = numeros.map{ Math.sqrt(it) }

    print(raiz)
}