fun add(value1: Int, value2: Int): Int = value1 + value2

fun square(n: Int): Int = n * n

fun math(lst:List<Int>, value:Int, f:(Int, Int) -> Int) : List<Int>{
    // 新規リスト生成
    val newList = java.util.ArrayList<Int>()

    for(e in lst){
        // 要素を1つずつ抽出し、f関数に渡す。戻り値を新規リストに追加
        newList.add(f(e, value))
    }

    return newList
}

fun main(args: Array<String>) {
    val src = listOf(1, 2, 3, 4, 5)

    // original
    println (src)
 
    // case 1
    val list1 = math(src, 1, ::add)
    println (list1)
 
    // case 2
    val list2 = math(src, 2, fun(value1: Int, value2: Int): Int { return value1 + value2 })
    println (list2)
 
    // case 3
    val list3 = math(src, 3, {value1: Int, value2: Int -> value1 + value2})
    println (list3)
}
