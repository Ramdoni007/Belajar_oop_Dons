package app

import data.BigNoted
import data.Noted

fun main() {

    val noted =Noted("Belajar Menyanyangi Mu ")
    println(noted.tittle)
    noted.tittle =""
    println(noted.tittle)



    val bignoted = BigNoted("Belajar Menyayangi Mu Part 2 ")
    println(bignoted.bigTittle)
    println(bignoted.tittle)



}