package me.caio.martins

fun main(){
    val values = IntArray(5)

    values[0] = 31
    values[1] = 15
    values[2] = 13
    values[3] = 3
    values[4] = 6
    
    for (valor in values) {
        println(valor)
    }

    println("--------------------------------")

    values.forEach {
        println(it)
    }

    println("--------------------------------")

    values.sort()
    for (index in values.indices) {
        println(index)
    }

}