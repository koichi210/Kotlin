fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        for (name in args) {
            println("Hello, ${name}!")
        }
    }else{
        println("No Arrgument")
    }
}
