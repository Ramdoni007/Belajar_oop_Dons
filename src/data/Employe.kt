package data

// Ini Adalah Contoh Dari Inheritance
open class Employe (val name: String) {  // Ini adalah Class Parents
    fun sayHello(name: String) {
        println("Hello $name My Name Is ${this.name}")
    }

}
// Ini adalah Class Child
class Manager(name:String): Employe(name)

class VicePresident(name: String): Employe(name)
