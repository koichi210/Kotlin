
fun main(args: Array<String>) {
    val list = listOf(1, 1, 2, 3, 5, 8 )
    println(list)

    // 各要素を2倍。C#のSelectのような書き方
    val twice = list.map { e -> e * 2 }
    println(twice)

    // フィルタ（奇数の要素のみ）
    val odd = list.filter { e -> e % 2 == 1 }
    println(odd)
}