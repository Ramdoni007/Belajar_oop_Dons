package data

interface Interactions {
    val name: String
    fun sayHello (name: String) : Unit {
        println("Hello $name My Name Is ${this.name} ")

    }

}

class Human (override val name: String ): Interactions {

}