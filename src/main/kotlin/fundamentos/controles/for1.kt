package fundamentos.controles

fun main(){
    val alunos = listOf("Macedo", "Charlin", "Debora")

    for((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }
}