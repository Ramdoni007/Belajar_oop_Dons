package data

open class Shape {
    open val corner : Int = -1
    // Dan Di Bawah Ini Merupakan Cara Membuat Suoer Function
    open fun  printName() {
        println("This Is Shape")
    }

}

class Rectangle: Shape() {
    override val corner: Int = 4
    val ParentCorner : Int = super.corner // Ini adalah contoh pemanggilan dari Super Keywoards Nya ya Breeeee :)
    override fun printName() {
        println("This is Rectangle")
        super.printName()
    }
}

class  Triangle : Shape() {
    override val corner: Int = 3
}


