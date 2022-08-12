package com.example.josue

import java.util.*

fun main() {
    val read = Scanner(System.`in`)

    print("Nome do Aluno: ")
    val nome = readln()
    print("1° Nota: ")
    val n1 = read.nextFloat()
    print("2° Nota: ")
    val n2 = read.nextFloat()
    print("3° Nota: ")
    val n3 = read.nextFloat()
    print("4° Nota: ")
    val n4 = read.nextFloat()

    print("Nome: $nome \n 1° Nota: $n1 \n 2° Nota: $n2 \n 3° Nota: $n3")
}