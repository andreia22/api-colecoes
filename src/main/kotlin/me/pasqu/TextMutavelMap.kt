package me.pasqu

fun main(){

    val andreia = Funcionario( "andreia", 2000.0, "CLT")
    val janaina = Funcionario( "janaina", 1000.0, "PJ" )
    val amanda = Funcionario( "amanda", 3000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(andreia.nome, andreia )
    repositorio.create(janaina.nome, janaina )
    repositorio.create(amanda.nome, amanda )

    println(repositorio.findByID(andreia.nome))

    println("_______________________________________")

    repositorio.findAll().forEach { println(it) }

    println("_______________________________________")

    repositorio.remove(andreia.nome)
    repositorio.findAll().forEach{ println(it) }
}