fun greeting(name: String = "Kotlin", option: String ="!") {
  println("Hello, ${name}${option}")
}

fun main(args: Array<String>) {
  greeting()
  greeting("Melinda")

  greeting(option="?")
  greeting("James", "?!")
}
