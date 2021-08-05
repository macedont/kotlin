package fundamentos.controles

fun main(){
    val nota = 2

    when(nota){
        10, 9 -> print("fantastico")
        8, 7 -> print("parabéns")
        6, 5, 4 -> print("tem como recuperar")
        in 0..3 -> print("te vejo no próximo semestre")
        else -> print("nota inválida")
    }
}