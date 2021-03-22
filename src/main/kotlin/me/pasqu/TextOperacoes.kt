package me.pasqu

fun main() {

    val salarios = doubleArrayOf(2000.0, 5000.0, 3000.0)

    for(salario in salarios) {
        println(salario)
    }
    println("________________________________")

     println("Maior salario: ${salarios.maxOrNull()}")
     println("Menor salario: ${salarios.minOrNull()}")
     println("Media salarial: ${salarios.average()}")

    println("________________________________")

    val salariosFiltro =  salarios.filter { it > 2500.0 }
    salariosFiltro.forEach {
        println(it)
    }
    println("________________________________")

    println(salarios.count{it in 2500.0..5000.0})

    println("________________________________")

    println(salarios.find{it == 3000.0})
    println(salarios.find{it == 7000.0})

    println("________________________________")

    println(salarios.any{it == 5000.0})
    println(salarios.any{it == 7000.0})

}