fun ArrayDescription(){
    val array: IntArray = intArrayOf(10, 20, 30, 40, 50)

    println("[0] = ${array[0]}")
    println("[1] = ${array[1]}")
    println("[2] = ${array[2]}")
    println("[3] = ${array[3]}")
    println("[4] = ${array[4]}")

    for(i in 0..4) {
        println("[${i}] = ${array[i]}")
    }

    println(array.size)
    for(i in 0..array.size-1) {
        println("[${i}] = ${array[i]}")
    }

    for(i in array.withIndex() ){
        println("${i}")
        println("[${i.index}] = ${i.value}")
    }
}

fun main(args: Array<String>) {
    ArrayDescription()
}