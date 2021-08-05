package fundamentos.controles

fun main(){
    val nota: Double = 9.77

    if(nota in 9.0..10.0){
        print("Aprovado com sobra!")
    }else if (nota in 7.0..8.9){
        print("Aprovado na média")
    }else if (nota in 4.0..6.9){
        print("Tem como recupera")
    }else if (nota in 0.0..3.9){
        print("Te vejo no próximo semestre")
    }else{
        print("nota invalida")
    }
}