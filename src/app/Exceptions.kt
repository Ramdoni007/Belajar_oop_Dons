package app




import Exceptions.ValidationsExceptions

fun main() {
//    ValidateAndsayHellow("Downy Chank")
//    ValidateAndsayHellow("")
//
    try {
        ValidateAndTryCatch("DownyChank")
        ValidateAndTryCatch("" )
        println("Program")
    }catch (error:ValidationsExceptions) {
        println("Terjadi Error ${error.message}")
    }
}


fun ValidateAndsayHellow(name:String) {
    if (name.isBlank()) {
        throw ValidationsExceptions("Name Is Blank")
    } else {
        println("Hellow $name ")
    }

}

fun ValidateAndTryCatch(name:String) {
    if (name.isBlank() ) {
        throw ValidationsExceptions("Name Is Blank 2" )

    }else{
        println("Heloow $name")
    }

 }





