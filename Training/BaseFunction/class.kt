class Empty {
}

class User {
    var id: Long = 0
    var name: String = "Unknown"

    override fun toString(): String {
        return " id=" + id + " name=" + name
    }
}

fun main(args: Array<String>) {
    val empty = Empty()
    println(empty)
    
    val user = User()
    println(user) // toStringをoverrideしてる

    user.id = 123
    user.name = "kotlin"
    println(user.toString())
}