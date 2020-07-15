fun add(value1: Int, value2: Int): Int {
    return value1 + value2
}

fun main(args: Array<String>) {

    println("add() : " + add(2, 3))

    // 型推論を使用した関数の代入
    val addFunc = ::add
    println("addFunc() : " + addFunc(3, 4))

    // 型推論を使用しない関数の代入
    // (Int, Int)は、関数の引数
    // -> Intは、関数の戻り
    val addFunc2: (Int, Int) -> Int = ::add
    val sum2 = addFunc2.invoke(5, 6)
    println("addFunc2() : " + sum2)

    //関数呼び出し
    val sum = addFunc.invoke(6, 7)
    println("invoke() : " + sum)
}