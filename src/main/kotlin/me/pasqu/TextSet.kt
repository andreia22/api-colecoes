package me.pasqu

fun main() {

    val andreia = Funcionario("andreia", 2000.0, "CLT")
    val janaina = Funcionario("janaina", 1000.0, "PJ")
    val amanda = Funcionario("amanda", 3000.0, "CLT")

    val funcionarios1 = setOf(andreia, amanda)
    val funcionarios2 = setOf(janaina)
    
    val resultado = funcionarios1.union(funcionarios2)
    resultado.forEach { println(it) }

    println("___________________________________________")

    val funcionarios3 = setOf(janaina, andreia, amanda)
    val resultadoSubtracao = funcionarios3.subtract(funcionarios2)
    resultadoSubtracao.forEach { println(it) }

    println("___________________________________________")

    val resultadoIntercect = funcionarios3.intersect(funcionarios2)
    resultadoIntercect.forEach { println(it) }

}    