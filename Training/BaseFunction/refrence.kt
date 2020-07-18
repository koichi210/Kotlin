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

fun localDefine(){
    val a: Int = 1
    print(a)

    val b = 1   // `Int`型が推論
    print(b)

    val c: Int  // 初期値が与えられない場合、型指定が必要
    c = 1       // 明確な代入
    print(c)

    var x = 5   // `Int`型が推論される
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

    val a = 100
    val b = 200
    if ( a == 100 && b ==100){
        println("aとbは100です")
    }
}

fun range(x: Int){
    // xが 1～10 までの範囲にあるかチェック
    if (x in 1..10)
        print("OK")


    // 3～50の範囲
    val rangenumber:IntRange = 3..50
    println(rangenumber)

    // 数値が範囲内にあるか判定
    val number : Int = 20
    val flg1 = number in rangenumber
    println(flg1)

    // 文字がが範囲内にあるか判定
    val ch: Char = 'c'
    val rangechar: CharRange = 'b'..'h'
    val flg2 = ch in rangechar
    println(flg2)
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

    val message: String = "Hello!"
    try {
        val a: Int = message.toInt()
        println("number = ${a}")
    } catch (e: NumberFormatException) {
        println("[${message}] is not IntType")
    }
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
            println(i)
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

fun TypeDescription(){
    val d: Double	// 64bit
    val f: Float	// 32bit
    val l: Long 	// 64bit
    val i: Int	    // 32bit
    val s: Short	// 16bit
    val b: Byte	    // 8bit

    d = 1.0
    f = 2.0F
    l = 1L
    i = 2
    s = 3
    b = 4
    print(d.toString() + f.toString() + l.toString() + i.toString() + s.toString() + b.toString() )

    //val ii: Int? = 1
    //val ll: Long? = ii // 暗黙の変換
    //print(ii == ll)   // 値は同一でも型が違うので、falseになる
    //print(ii == ll.toInt())   // 型を合わせれば、trueになる
}

fun ArrayDescription(){
    val ary = Array(5, { i -> (i * i).toString() })
    for(i in ary)
        print(" " + i)
}

fun PrintDescription(){
    /// ダブルクォートを3つ記述
    val multiline:String = """
        |Hello!
        |A-sam
        """
    println(multiline)

    println("hello ")
    println("world")

    print("hello \n")
    print("world \n")

    print("hello ")
    print("world")
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
    println()

    // ループ5
    for (l in 0..100 step 10) {
        print(" " + l)
    }
    println()

    // ループ6
    for (l in 100 downTo 90) {
        print(" " + l)
    }
    println()

    PrintDescription()

    tryCatch()
}
