package me.pasqu

fun main() {

    val salarios = DoubleArray(3)

    salarios[0] = 2000.0
    salarios[1] = 4000.0
    salarios[2] = 1000.0

    salarios.forEach {
        println(it)
    }
        println("_______________________________________________")

        salarios.forEachIndexed { index, salario ->
            salarios[index] = salario * 1.1
        }
        salarios.forEach {
            println(it)
        }
        println("_______________________________________________")
        val salarios2 = doubleArrayOf(5000.0, 2000.0, 3000.0)
        salarios2.sort()
        salarios2.forEach {
            println(it)
        }

    }
