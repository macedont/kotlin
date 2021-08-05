package fundamentos

import fundamentos.pacoteA.simplesFunc as funcaoSimples
import fundamentos.pacoteA.Algo
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.* //importa tudo do pacote

fun main(){
    println(funcaoSimples("OI"))

    val coisa = Algo("MALU") //instanciando a classe algo

    println(coisa.nome)
    println(CARA)
    println("${soma(1, 2)} ${subtracao(3 , 2)}")
}