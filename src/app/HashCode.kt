package app

import data.company

fun main() {

    val company1 = company("Rahmat")
    val company2 = company("Richard")


    println(company1.hashCode())
    println(company2.hashCode())

}