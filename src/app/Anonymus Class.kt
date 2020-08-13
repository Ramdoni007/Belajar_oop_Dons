package app

import data.Actions

fun FireActions(action:Actions) {
    action.actions()
}



fun main() {

    FireActions( object : Actions {
        override fun actions() = println("Hello My Name Is Action One")  } )

    FireActions( object : Actions {
        override fun actions() = println("Hello My Name Is Action Two") } )


}