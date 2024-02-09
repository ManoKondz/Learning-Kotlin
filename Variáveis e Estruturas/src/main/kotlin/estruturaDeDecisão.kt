fun main() {
    var idade:Int = 61
    if (idade<=12) {
        println("Criança")
    } else if (idade >= 13 && idade <=20) {
        println("Jovem")
    } else if (idade >= 21 && idade <= 59) {
        println("Adulto")
    } else {
        println("Idoso")
    }
    var cargo:String = "presidente"
    when(cargo) {
        "Presidente" -> println(6000f)
        "Gerente" -> println(4500f)
        "Coordenador" -> println(2500f)
        "Analista" -> println(2000f)
        "Estagiário" -> println(600f)
        else -> println("Cargo não encontrado")
    }
}