package data

open class DaftarWaifu (val name: String) {

    open fun sayHellow(name: String) {
        println("Hello $name Kenalkan saya ${this.name} Adalah Waifu Idaman Downy:)")
    }




}

class WaifukeDua(name: String) : DaftarWaifu(name) {
    override fun sayHellow(name: String) {
        println("Hellow $name Kenalkan Saya ${this.name} Adalah Waifu Kedua Downy Selanjutnya")
    }

}


class WaifukeTiga(name: String) : DaftarWaifu(name) {
    override fun sayHellow(name: String) {
        println("Hellow $name Kenalkan Saya ${this.name} Adalah Waifu Ketiga Downy Yang Paling Paling :)")
    }
}


