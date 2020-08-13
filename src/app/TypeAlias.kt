package app

import data.Applicationsinnerclass
import data.Utilites

typealias Aplikasi = Applicationsinnerclass
typealias App = data2.Applicationsinnerclas // Mengaliaskan class dengan nama yang sama dari package berbeda agar bisa jalan





fun main() {

    val aplikasi = Aplikasi("Doni")
    val app = App("Ryan Maulana")


    println(Aplikasi.toUpper("doni selalu ceria"))
    println(App.toLowwer("April Selalu MENATAP DONI"))






}