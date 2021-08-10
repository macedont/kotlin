package fundamentos.operadores

data class Carro(val modelo: String, val marca: String)

//o operador destructuring ele possibilita extrair dados de arrays ou objetos em variáveis distintas
fun main(){
    val (modelo, marca) = Carro("gol", "volks")

    println("$modelo $marca")

    val (marido, mulher) = listOf("Juaum", "Maria")
    println("$marido e $mulher")

    val(_, _, terceiroLugar) = listOf("Kimi", "Bottas", "Hamilton")
    println("$terceiroLugar terminou em terceiro lugar")
}