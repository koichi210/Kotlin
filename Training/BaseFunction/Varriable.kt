fun main(args: Array<String>) {
    val a: String = "Kotlin"
    val b = "KOTLIN"
    // val c: String = null // "null" can not declare
    val d: String? = null     // Can be declared by adding "?"
    println("${a} ${b} ${d}")

    val name = "Juliet" 
    println("Hello, ${name}")

    val x = 10
    var y = 20
    println("${x} ${y}")

    //x = 100   // valは再代入NG
    y = 200     // varは再代入OK
    println("${x} * ${y} = ${x*y}")
}
