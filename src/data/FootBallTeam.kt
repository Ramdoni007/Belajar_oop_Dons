package data

/**
 *  Visibility Modifiers adalah Class, Interface, Constructor, Function, dan Properties (termasuk Getter dan Setter) bisa memiliki
    Visibility Modifiers di Kotlin
● Ada 4 visibility modifiers di kotlin, yaitu: public, private, protected, internal
● Secara standar visibility modifiers di kotlin adalah public
 */

class FootBallTeam (val name: String , val age: Int ) {

   public fun team() {  // ini adalah salah satu daru Visibility Modifiers dalam Functions
        println("Ini adalah Team $name yang sudah berusia $age ")
    }

}