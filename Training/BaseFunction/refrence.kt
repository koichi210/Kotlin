package my.reference

fun sum1(a: Int, b: Int): Int {
  return a + b
}

fun sum2(a: Int, b: Int) = a + b

// 意味のある値を返さない
fun printSum1(a: Int, b: Int): Unit {
  print(a + b)
}

// Unitは省略できる
fun printSum2(a: Int, b: Int) {
  print(a + b)
}

fun localDefine()
{
  val a: Int = 1
  print(a)

  val b = 1   // `Int`型が推論
  print(b)

  val c: Int  // 初期値が与えられない場合、型指定が必要
  c = 1       // 明確な代入
  print(c)

  var x = 5 // `Int`型が推論される
  x += 1
  print(x)
}

// オブジェクトの型チェック
fun getStringLength(obj: Any): Int? {
  if (obj is String) {
    // `obj` はこのブランチ内では自動的に`String`へキャストされる
    return obj.length
  }

  // `obj` は型チェックが行われたブランチ外では、まだ`Any`型である
  return null
}

// 条件分岐
fun caseDescription(obj: Any) {
  when (obj) {
    1          -> print("One")
    "Hello"    -> print("Greeting")
    is Long    -> print("Long")
    !is String -> print("Not a string")
    else       -> print("Unknown")
  }

  var param = 2
  val paramStr = if (param == 1) {
      "one"
  } else if (param == 2) {
      "two"
  } else {
      "three"
  }
  print(paramStr)
}

fun range(x: Int, y:Int){
  // xが 1～y-1 までの範囲にあるかチェック
  if (x in 1..y-1)
    print("OK")
}

fun method(a: Int = 0, b: String = ""){
  println(a.toString() + b)
}

fun getmap(){
  val map = mutableMapOf(1 to "Kotlin")
  for ((k, v) in map) {
    println("$k -> $v")
  }
}

fun tryCatch(){
  val result = try {
      println("try catch test")
  } catch (e: ArithmeticException) {
      throw IllegalStateException(e)
  }
  println(result)
}

fun printLog(){
  print("Hello,")
  print("World")

  println("Hello,")
  println("World")
}

class Turtle {
    fun penDown(){}
    fun penUp(){}
    fun turn(degrees: Double){print(degrees)}
    fun forward(pixels: Double){print(pixels)}
}
fun withDescription(){
  val myTurtle = Turtle()
  with(myTurtle) { // 100pxの四角形を描く
      penDown()
      for(i in 1..4) {
          forward(100.0)
          turn(90.0)
      }
      penUp()
  }
}

fun main(args: Array<String>) {
  val message = "Hello, world!" 
  println(message)

  // ループ1
  for (arg in args)
    print(arg)

  // ループ2
  for (i in args.indices)
    print(args[i])

  // ループ3
  var i = 0
  while (i < args.size)
    print(args[i++])

  // ループ4
  for (l in 1..10) {
    print(" " + l)
  }
}