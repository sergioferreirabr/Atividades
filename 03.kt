package com.example.josue

import java.text.DecimalFormat
import java.util.*

fun main() {

    val df = DecimalFormat("#")
    val dv = DecimalFormat("#.##")
    val read = Scanner(System.`in`)

    print("Digite o número A: ")
    val n1 = read.nextFloat()
    print("Digite o número B: ")
    val n2 = read.nextFloat()
    val soma = df.format(n1+n2);
    val sub = df.format(n1-n2);
    val div = dv.format(n1 / n2);
    val mult = df.format(n1*n2);
    // Resultado
    println("$n1 + $n2 = $soma")
    println("$n1 - $n2 = $sub ")
    println("$n1 x $n2 = $mult")
    println("$n1 / $n2 = $div")

}