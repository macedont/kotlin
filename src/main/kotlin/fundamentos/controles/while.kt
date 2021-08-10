package fundamentos.controles

fun main(){
    var num: Int = 0

    while(num != -1){
        val line = readLine() ?: "0"
        num = line.toIntOrNull() ?: 0

        println("você escolheu $num")
    }

    print("até a próxima")
}