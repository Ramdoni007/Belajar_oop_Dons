package data


// Ini adalah contoh dari pembuatan Contructure dalam class yang dimana ini ada primary contructor
open class Customer(val name: String ,  val type: String , val balance : Long ) {
    constructor( name: String , type: String ) : this(name, type , 0 )
    constructor(name: String) : this (name , "Standart")


}

// Di Bawah ini merupakan Child Parent yang di dalam nya ada contructur yang akan memanggil Contructor Class Parent di atas
class PremiumCustomer : Customer {
    constructor(name: String) : super(name, "Premium")
    constructor(name: String, balance: Long): super(name,"Premium" ,balance) // Dan Super disini adalah proses diman kita memanggil constructor parrent nya

}
// Ini Child Parents Yang dimana ada sebuah Secondary Constructor
class ExcecutiveCustomer(name:String , balance: Long ) : Customer(name,"Excecute") {
    constructor(name: String) : this(name,0)


}



