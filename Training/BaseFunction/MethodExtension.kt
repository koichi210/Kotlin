// 自前の関数
fun MyHello(s: String) {
    println("My Hello, ${s}")
}

// Stringを拡張できる
fun String.hello() {
    println("String Hello, $this")
}

fun main(args: Array<String>) {
    // 自前の関数を呼ぶ
    MyHello("World") 

    // 拡張したStringの関数を呼ぶ
    "World".hello()
}

