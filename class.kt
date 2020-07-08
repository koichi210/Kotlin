class User {
  var id: Long = 0
  var name: String = ""

  override fun toString(): String {
    return " id=" + id + " name=" + name
  }
}

fun main(args: Array<String>) {
  val user = User()
  user.id = 123
  user.name = "kotlin"
  println(user.toString())
}