fun breakDescription(){
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            println( i.toString() + " " + j.toString())
            if (i==5 && j ==5)
                break@loop
        }
    }
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
}
