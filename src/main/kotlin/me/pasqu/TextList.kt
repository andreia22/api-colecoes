package me.pasqu

fun main() {

    val andreia = Funcionario( "andreia", 2000.0, "CLT")
    val janaina = Funcionario( "janaina", 1000.0, "PJ" )
    val amanda = Funcionario( "amanda", 3000.0, "CLT")

    val funcionarios = listOf(andreia, janaina, amanda)

    funcionarios.forEach { println(it) }
    println("_______________________________________")
    println(funcionarios.find{it.nome == "janaina"})
    println("_______________________________________")

    funcionarios
        .sortedBy {it.salario}
        .forEach { println(it) }

    println("_______________________________________")

    funcionarios
        .groupBy {it.tipoContratacao}
        .forEach { println(it) }

}



