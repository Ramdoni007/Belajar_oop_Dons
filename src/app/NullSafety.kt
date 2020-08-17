package app

data class Friend( val name : String )



fun sayHellow(friend: Friend? ) {

    if ( friend != null ) {
        println("Hello ${friend.name}") // INI CARA PERTAMA UNTUK MENGATASI Null yaitu Null checking
    }
}

fun saySayang(friendgirl: Friend? ) {
    println("Hello ${friendgirl?.name}") // Ini adalah cara kedua untuk mengatasi Null yaitu dengan tanda sama dengan ?
}  

fun saySapa(friend2: Friend ) {
    println()
}


fun main() {
    sayHellow(Friend("Downy"))
    sayHellow(null)
    saySayang(Friend("Aprillia"))
    saySayang(null)

}
