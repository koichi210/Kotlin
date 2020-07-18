//Mapは検索が速い
fun MapDescription() {
    val a: Map<String, String> = mapOf("1" to "one", "2" to "two", "3" to "three")
    val number1 = a["1"]
    val number2 = a["2"]
    val number3 = a["3"]
    println("${number1}, ${number2}, ${number3}")
}

fun MapDescription2() {
    val a: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    val number1 = a[1]
    val number2 = a[2]
    val number3 = a[3]
    println("${number1}, ${number2}, ${number3}")
}

fun MutableMapDescription() {
    val a: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    a.put(4, "four")
    val number1 = a[1]
    val number2 = a[2]
    val number3 = a[3]
    val number4 = a[4]
    println("${number1}, ${number2}, ${number3}, ${number4}")

    a.remove(2)
    val numberA = a[1]
    val numberB = a[2]
    val numberC = a[3]
    val numberD = a[4]
    println("${numberA}, ${numberB}, ${numberC}, ${numberD}")

    // 取得値がnullだった場合、Defualt値へ置き換えることができる
    val numberBb = a.getOrDefault(2,"Unknown")
    println(numberBb)
}

fun main(args: Array<String>) {
    MapDescription()
    MapDescription2()
    MutableMapDescription()
}
