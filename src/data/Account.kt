package data

class Account {
    val name: String by lazy {
        println("Hello Call me")
        "DOWNY"
    }
}