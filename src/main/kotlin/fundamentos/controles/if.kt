package fundamentos.controles

fun main(){
    var nota: Double = 7.5
    var nota1: Double = 2.4

    var media = (nota + nota1) / 2

    if(media >= 6) print("Aprovado") else print("Reprovado")

    //é obrigatório setar o valor da variável na ultima linha
    val maiorValor = if(nota > nota1){
        println("processando o if")
        nota
    }else{
        println("processando o else")
        nota1
    }

    val menorValor = if(nota < nota1) nota else nota1
}