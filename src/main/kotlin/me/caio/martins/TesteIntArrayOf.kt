package me.caio.martins

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)
    
    values.forEach {
        println(it)
    }

    print("------------------------------")

    values.sort()
    values.forEach {
        println(it)
    }
}