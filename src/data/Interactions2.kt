package data

interface Interactions2 {
    val name: String // Ini tidak bisa di Isi valuenya
    fun sapaDia(name:String) {
        println("Kamu $name adalah Alasan Terbesar ${this.name} Untuk Sukses ")
    }





}

class itsuki(override val name: String ): Interactions2
