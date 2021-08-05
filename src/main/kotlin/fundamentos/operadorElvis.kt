package fundamentos

/**
 * o operador elvis é basicamente um if ternário faz com uma função que seja obrigatória ter um numero
 * receber num valor padrão caso o valor passado seja null
 */
fun main(){
    val opcional: String? = null
    val obrigatoria : String = opcional ?: "Valor Padrão"

    println(obrigatoria)
}