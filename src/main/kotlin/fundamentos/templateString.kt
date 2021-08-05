package fundamentos

fun main(){
    val aprovados = listOf("Juaum", "Maria", "Macedo")
    println("O primeiro colocado foi ${aprovados[0]}")

    val humor = false
    print("Hoje eu estou ${if (humor) "bem humorado" else "mal humorado"}")

}