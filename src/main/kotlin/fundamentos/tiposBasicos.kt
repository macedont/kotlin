package fundamentos

fun main(args: Array<String>) {
    //numericos inteiros
    val num: Byte = 127
    val num1: Short = 12345
    val num2: Int = 1_234_567_891 //os valores pode ser divididos por _
    val num3: Long = 1234567897944562154

    //tipos reais
    val num4: Float = 3.14F
    val num5: Double = 3.14

    //tipo caractere
    val char: Char = '?' // char só pode ser com aspa simples

    //tipo bool
    val bool: Boolean = true //false

    println(listOf(num, num1, num2, num3, num4, num5, char, bool))

    println(2 is Int)

    //tudo é objeto

    println(10.dec())
}