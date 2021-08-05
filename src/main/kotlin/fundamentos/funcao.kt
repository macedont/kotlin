package fundamentos

fun main(){
    var c = somar(1, 2)
    void()

    println("a soma é: $c")
}


fun somar(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun void(){
    println("oi, eu sou uma void uma função void :)")
}