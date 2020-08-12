package data

class KoleksiIstri (val name : String ) {


    inner class SuperIstri ( val name: String ) {
        fun daftar() {
            println("Hi Kenalkan Nama Saya $name , Dan Saya adalah Istri Dari ${this@KoleksiIstri.name}" )
        }
    }





}