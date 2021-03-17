package me.pasqu

fun main() {

    val salarios = doubleArrayOf(2000.0, 5000.0, 3000.0)

    for(salario in salarios) {
        println(salario)
    }
    println("________________________________")

     println("Maior salario: ${salarios.max()}")
     println("Menor salario: ${salarios.min()}")
     println("Media salarial: ${salarios.average()}")

    println("________________________________")

    val salariosFiltro =  salarios.filter { it > 2500.0 }
    salariosFiltro.forEach {
        println(it)
    }
}