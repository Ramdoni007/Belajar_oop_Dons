package data

abstract class Location (val name: String ) {

}

class Pulau (name: String) : Location(name){

}

class Kota (name: String ): Location(name){

}


class Kecamatan(name: String) : Location(name) {

}