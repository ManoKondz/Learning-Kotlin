fun main() {
    var idade:Int = 61
    if (idade<=12) {
        println("Criança")
    } else if (idade >= 13 && idade <=20) {
        println("Jovem")
    } else if (idade >= 21 && idade <= 59) {
        println("Adulto")
    } else if (idade > 60) {
        println("Idoso")
    }
}