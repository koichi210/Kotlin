class MyInt(val value: Int) {
    fun plus(myInt: MyInt): MyInt =
        MyInt(value + myInt.value)
}

fun StringBuilder.plusAssign(any: Any) {
    append(any)
}

fun main(args: Array<String>) {
    val sum = MyInt(3).plus(MyInt(5))
    println(sum.value)

    //NG : 'operator' modifier is required on 'plus' in 'MyInt'.
    // val sum2 = MyInt(2) + MyInt(7)
    // println(sum2.value)


    //NG : 'operator' modifier is required on 'plus' in 'MyInt'.
    //val sb = StringBuilder()
    //sb += "My"
    //sb += " name"
    //sb += " is"
    //sb += " Kotlin"
    //println(sb)
}

