package data

class Hoby {


    var waktuKecil =""
    var waktuRemaja = ""
    var waktuBesar = ""


    fun keSatu(name: String) {
        println("Waktu Kecil Aku Mempunyai Hobby Sering Main $waktuKecil")
    }

    fun keSatu(name: String , name2:String){ // Ini Namanya Function Overloading karena kita membuat Function Yang Sama di 1 Class yang sama
        println("Waktu Kecil Juga Aku Mempunyai Hobby Sering Main $waktuKecil")



    }



}