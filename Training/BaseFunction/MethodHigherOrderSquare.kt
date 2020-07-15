fun add(value1: Int, value2: Int): Int {
    return value1 + value2
}

fun apply(n: Int, f: (Int, Int) -> Int): Int {
    println("start")
    val r = f(1, n)
    println("end")
    return r
}


fun square(n: Int): Int = n * n

fun math(lst:List<Int>, f:(Int) -> Int) : List<Int>{
    // 新規リスト生成
    val newList = java.util.ArrayList<Int>()

    for(e in lst){
        // 要素を1つずつ抽出し、f関数に渡す。戻り値を新規リストに追加
        newList.add(f(e))
    }

    return newList
}

fun main(args: Array<String>) {
    val src = listOf(1, 2, 3, 4, 5)

    println("before : " + src) 
    println("after    : " + math(src, ::square)) 
}
