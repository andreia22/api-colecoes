package me.pasqu

fun main(){

    val andreia = Funcionario( "andreia", 2000.0, "CLT")
    val janaina = Funcionario( "janaina", 1000.0, "PJ" )
    val amanda = Funcionario( "amanda", 3000.0, "CLT")

    println("________________LIST_____________________")

    val funcionarios = mutableListOf(andreia, janaina)
    funcionarios.forEach { println(it) }

    println("______________________________________")

    funcionarios.add(amanda)
    funcionarios.forEach { println(it) }

    println("______________________________________")

    funcionarios.remove(janaina)
    funcionarios.forEach { println(it) }

    println("________________SET______________________")

    val funcionariosSet = mutableSetOf(amanda)
    funcionariosSet.forEach { println(it) }
    println("______________________________________")

    funcionariosSet.add(amanda)
    funcionariosSet.add(andreia)
    funcionariosSet.forEach { println(it) }

    println("______________________________________")

    funcionariosSet.remove(amanda)
    funcionariosSet.forEach { println(it) }
}