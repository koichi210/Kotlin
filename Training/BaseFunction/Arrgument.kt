fun main(args: Array<String>) {

    // 引数がカラっぽかチェック
    if (args.isNotEmpty()) {
        // カラでなければ引数を利用
        println("Hello, ${args[0]}!")
    } else {
        println("No arrgument")
    }

    //三項演算子も使える？書き方はExcelに似ている
    // val name = if(args.isNotEmpty() args[0] else "Undefined" )
    // println("Hello, ${args[0]}!")
}
