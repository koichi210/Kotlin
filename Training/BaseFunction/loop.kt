fun breakDescription(){
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            println( i.toString() + " " + j.toString())
            if (i==5 && j ==5)
                break@loop
        }
    }
}

fun whileLoop(){
    var a:Int = 1
    val b:Int = 5

    while(a <= b) {
        println("${a} * ${b} = ${a*b}")
        a++
    }
}

fun doWhileLoop(){
    var c:Int = 10
    val d:Int = 6

    do {
        println("${c} * ${d} = ${c*d}")
        c++
    }while(c <= d)
}

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        for (name in args) {
            println("Hello, ${name}!")
        }
    }else{
        println("No Arrgument")
    }

    var value:Int = 10
    while(value != 0){
        println("${value}")
        value--
    }

    breakDescription()

    whileLoop()
    doWhileLoop()
}
