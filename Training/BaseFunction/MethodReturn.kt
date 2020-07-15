// defined return type
// ex) Int
fun add(value1: Int, value2: Int): Int {
    return value1 + value2
}

fun sub(value1: Int, value2: Int): Int = value1 - value2

fun main(args: Array<String>) {
    var value1 = 7
    var value2 = 3

    var sum = add(value1,value2)
    println("add() : ${value1} + ${value2} = ${sum}")

    // call method in printIn
    println("sub() : ${value1} - ${value2} = ${sub(value1, value2)}")
}