// 抽象クラスには「abstract」をつける。openをつけなくても継承できる。
abstract class Greeter {
  abstract val name: String
  abstract fun greet()
}

class JapaneseGreeter(override val name: String):Greeter(){
  override fun greet() {
    println("こんにちわ ${name}")
  }
}

class EnglishGreeter(override val name: String):Greeter(){
  override fun greet() {
    println("hello ${name}")
  }
}

class SpanishGreeter(override val name: String):Greeter(){
  override fun greet() {
    println("hola ${name}")
  }
}

fun main(args: Array<String>) {
  val jg = JapaneseGreeter("コトリン")
  jg.greet()

  val eg = EnglishGreeter("Kotlin")
  eg.greet()

  val sg = SpanishGreeter("kotlin")
  sg.greet()
}
