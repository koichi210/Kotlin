fun greeting(name: String = "Kotlin", option: String ="!") {
    println("Hello, ${name}${option}")
}

// 可変長引数
fun Add(vararg x: Int) {
    var sum = 0
    for(i in x) {
        sum += i
    }
    println("${sum}")
}

fun main(args: Array<String>) {
    greeting()
    greeting("Melinda")

    greeting(option="?")
    greeting("James", "?!")

    Add(1)
    Add(1,2)
    Add(1,2,3)
}
