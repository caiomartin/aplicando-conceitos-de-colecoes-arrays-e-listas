package me.caio.martins

fun main() {
    val salarios = doubleArrayOf(100.0, 2250.0, 4000.0)
    
    for(salario in salarios) {
        println(salario)
    }

    println("-----------------------------------------")

    println("Maior Salario: " + salarios.max())
    println("Menor Salario: " + salarios.min())
    println("Media Salario: " + salarios.average())

    println("-----------------------------------------")

    val salariomariosQue2500 = salarios.filter { it > 2500.0}

    salariomariosQue2500.forEach {
        println(it)
    }

}