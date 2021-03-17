package me.pasqu

fun main(){

    val pair: Pair<String, Double> = Pair("Ana", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("________________________________________________")

    val map2 = mapOf(
        "Maria" to 2500.0,
        "João" to 1500.0
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

}