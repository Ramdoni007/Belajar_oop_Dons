package data

interface Base  {
    fun sayHellow(name: String ) {
    }
    fun sayGoodbay(name:String) {

    }
}


class myBase : Base {
    override fun sayHellow(name: String) {
        println("Hellow $name")
    }

    override fun sayGoodbay(name: String) {
        println("Heloow $name")
    }
}

// Melakukan manual proses delegasi

class MyBaseDelegate(val base: Base): Base by base { // ini adalah kode delegasi class my base ke dalam object di propertiesnya



}