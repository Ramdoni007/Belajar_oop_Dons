package data

abstract class WaifuRun {
    abstract val name: String
    abstract fun run()

}


class waifu:WaifuRun() {
    override val name: String = "EMILIA"
    override fun run() {
        println("Ayu Lari Padaku Emilia Chan ")

    }


}

class waifu1:WaifuRun() {
    override val name: String = "ITSUKI"
    override fun run() {
        println("Ayu Datang KepadaKu itsuki Chuannn")
    }

}