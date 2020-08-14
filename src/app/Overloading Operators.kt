package app

import data.GadoGado

fun main() {

    val gadogado1 = GadoGado(200)
    val gadogado2 = GadoGado(300)
    val gadogado3 = gadogado1 + gadogado2

    println(gadogado3)
    println(gadogado3 - GadoGado(200))







}