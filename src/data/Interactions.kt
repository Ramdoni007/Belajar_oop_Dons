package data

interface Interactions {
    val name: String
    fun sayHello (name: String) : Unit {

    }

}

class Human (override val name: String ): Interactions {
    override fun sayHello(name: String) {
        println("Hello $name My Name Is ${this.name} ")
    }
}

