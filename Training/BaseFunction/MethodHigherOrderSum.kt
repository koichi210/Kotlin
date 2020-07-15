fun add(value1: Int, value2: Int): Int {
    return value1 + value2
}

fun apply(n: Int, f: (Int, Int) -> Int): Int {
    val m = 1
    
    // NG → none of the following functions can be called with the arguments supplied
    //            以下の関数は、引数を指定して呼び出すことはできません
    // 以下とは、「Byte」「Duble」「Float」「Int」「Long」「Short」
    println("${m} + " + n)        // OK
    println("${m} + ${n}")        // OK
    //println(n + " + ${m} ") // NG
    //println(m + " + " + n) // NG
    println(n.toString() + " + ${m} ") // OK
    println(m.toString() + " + " + n) // OK
    val r = f(m, n)
    return r
}

fun counterFunc(): ()->Int {
    var count = 0
    return {
        count++
    }
}

fun counter(): Int {
    var count = 0
    count++
    return count
}

fun main(args: Array<String>) {
    val sum = apply(3, ::add)
    println(sum)

    // インスタンス化しているので、前の値を保持
    val cnt = counterFunc()
    println(cnt())    // 0
    println(cnt())    // 1
    println(cnt())    // 2
    // println(counterFunc()) // NG

    // 毎回生成＆インクリなので、0→１になるだけ
    println(counter())    // 1
    println(counter())    // 1
    println(counter())    // 1
}
