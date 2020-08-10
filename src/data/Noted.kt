package data

class Noted(tittle: String ) {

        var tittle: String = tittle
            get() {
                println("Call getter functions")
                return field
            }
            set(value) {
                println("Call Setter Functions ")
                if (value.isNotBlank()) {
                    field = value
                } else {
                    println("Invalid tittle ")
                }


            }
    }


    class BigNoted(val tittle:  String ){
        val bigTittle : String
            get() =tittle.toUpperCase()

    }