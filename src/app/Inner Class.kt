package app

import data.KoleksiIstri

fun main() {

val istrike1 = KoleksiIstri("Doni")
val daftar1 =istrike1.SuperIstri("Pevita")
val daftar2 = istrike1.SuperIstri("Raisa")


val istrike2 = KoleksiIstri("Doni")
val daftar3 = istrike2.SuperIstri("Olivia")
val daftar4 = istrike2.SuperIstri("Stephani")

daftar1.daftar()
daftar2.daftar()
daftar3.daftar()
daftar4.daftar()





}