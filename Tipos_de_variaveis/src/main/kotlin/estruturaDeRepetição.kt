fun main() {
    for(i in 1 .. 10) {
        print("${i} ")
    }
    println("")
    for (i in 10 downTo 1) {
        print("${i} ")
    }
    val frase:String = "Criação de apps móveis"
    println("")
    for(i in frase) {
        print("${i}   ")
    }
    println("")
    for(i in 1 .. 10 step 2) {
        print("${i} ")
    }
    println("")
    var index:Int = 0
    while (index<=10) {
        print("${index} ")
        index++
    }
    println("")
    while (index>=0) {
        print("${index} ")
        index--
    }
    println("")
    index = 0
    while (index<frase.length) {
        print("${index} ")
        index++
    }
    println("")
    index = 0
    do {
        print("${index} ")
        index++
    } while (index != 10)
}