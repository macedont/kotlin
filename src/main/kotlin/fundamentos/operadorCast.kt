package fundamentos

fun imprimirNota(nota: Any){
    //operador cast ele faz com que a variável generica apenas seja usada no when quando ela for int
    when(nota as? Int ?: 10){ //conversão segura
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1 -> println("E")
        0 -> println("F")
        else -> println("Nota inválida")
    }
}

fun main(){
    val notas = listOf(9, 7, 2, 5, 10, 14, 0, 7)
    for((nota) in notas.withIndex()){
        imprimirNota(nota)
    }
}