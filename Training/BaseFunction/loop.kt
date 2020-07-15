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
}
