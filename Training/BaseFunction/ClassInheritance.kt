// 継承可能クラスには「open」をつける
open class BaseClass{
  fun number(){
    println("my nmuber is 123")
  }
}

class Person:BaseClass(){
  fun name(){
    println("my name is Kotlin")
  }
}

fun main(args: Array<String>) {
  val ps = Person()
  ps.number()
  ps.name()
}
