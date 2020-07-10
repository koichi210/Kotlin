fun main(args: Array<String>) {
    val list = listOf(1, 1, 2, 3, 5, 8 )
    println("aa" + list)
 
    // 各要素を2倍
    val twice = list.map { e -> e * 2 }
    println(twice)

    // 奇数の要素のみ
    val odd = list.filter { e -> e % 2 != 0 }
    println(odd)
}