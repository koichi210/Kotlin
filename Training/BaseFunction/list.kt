fun listDescription(){
    val list = listOf(1, 1, 2, 3, 5, 8 )
    println(list)

    // 各要素を2倍。C#のSelectのような書き方
    val twice = list.map { e -> e * 2 }
    println(twice)

    // フィルタ（奇数の要素のみ）
    val odd = list.filter { e -> e % 2 == 1 }
    println(odd)
}

fun listDescription2(){
    val a: List<Int> = listOf(1, 2, 3, 4, 5)

    println("[0] = ${a[0]}")
    println("[1] = ${a[1]}")
    println("[2] = ${a[2]}")
    println("[3] = ${a[3]}")
    println("[4] = ${a[4]}")
}

// 要素数を変更できる
fun mutableListDescription(){
    val array: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    array.add(6)
    for((x, y) in array.withIndex() ){
        println("${x} : ${y}")
    }

    array.removeAt(2)
    for((x, y) in array.withIndex() ){
        println("${x} : ${y}")
    }
}

fun main(args: Array<String>) {
    listDescription()

    mutableListDescription()
}