fun sum(ints: List<Int>): Int {
  var sum = 0
  for (e in ints) {
    sum += e
  }
  return sum
}

fun recursibleShort(ints: List<Int>): Int =
    // isEmpty リストがカラかチェック
    if (ints.isEmpty()) 0
    // first リストの先頭要素
    // drop リストの先頭要素を取り除いて、新しいリストを生成
    else ints.first() + recursibleShort(ints.drop(1))

fun recursibleVerbose(ints: List<Int>): Int
{
    if (ints.isEmpty()){
        return 0
    }else{
        return ints.first() + recursibleVerbose(ints.drop(1))
    }
}

fun main(args: Array<String>) {
    var lst = listOf(1, 2, 3, 4)
 
    var resultSum = sum(lst)
    println("for sum : " + resultSum)

    var resultrecursibleShort = recursibleShort(lst)
    println("recursibleShort sum : " + resultrecursibleShort)

    var resultrecursibleVerbose = recursibleVerbose(lst)
    println("recursibleVerbose sum : " + resultrecursibleVerbose)
}