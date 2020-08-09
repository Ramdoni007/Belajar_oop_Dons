package data

class company (val name: String ) {

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is company -> other.name == this.name
            else -> false

        }
    }


    override fun hashCode(): Int {
        return name.hashCode()
    }
}