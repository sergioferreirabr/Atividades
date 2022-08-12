package com.example.josue

import org.w3c.dom.Text
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
    val media = (n1 + n2 + n3 + n4) /4 ;
    print("Média do aluno $nome : $media \n")

    val m = media

    if (m > 7) {
        print("Aprovado")
    }
    if (m < 3) {
        print("Reprovado")
    }
    if (m < 7 && m >= 4){
        print("Recuperação")
    }
}