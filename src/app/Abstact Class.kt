package app

import data.Kecamatan
import data.Kota
import data.Location
import data.Pulau

fun main() {

//    val Tempat = Location() // Ini akan error ketika kita membuat variable object dengan memanggil class data lokaion yang sudah menjadi abstract
//
    val Tempat1 = Pulau("Jawa")

    val Tempat2 = Kota("Bogor")

    val Tempat3 = Kecamatan("Gunung Putri")



    println(Tempat1.name)
    println(Tempat2.name)
    println(Tempat3.name)






}