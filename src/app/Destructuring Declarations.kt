package app


import data.Game
import data.Login
import data.minmax
import kotlin.math.log


fun minmax (value1: Int , value2: Int ): minmax {
    return when {
        value1 > value2 -> minmax(value2,value2 )
        else -> minmax(value1,value2)
    }
}

fun login(login: Login , callback: (Login) -> Boolean ): Boolean {
    return callback(login)
}



fun main() {


val game = Game("GTA",1000_000)

//    val name = game.name
//    val price = game.price


    val (name,price ) = game
    println(name)
    println(price)

//val result = minmax(10,100 )
//val min = result.min
//val max = result.max

val (min, max ) = minmax(10,50)
    println(min)
    println(max)

val login = Login("Doniyyy","Rahasia123")
//    login(login) { login ->
//        login.username == "Doni yyy " && login.password == "12345SangatRahasia"
//    }

  login(login){(username , passwords ) ->
      username == "doni yyy " && passwords == "12345SangatRahasia"

  }
    println(login)

}



