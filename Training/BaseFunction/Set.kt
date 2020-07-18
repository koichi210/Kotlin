//Setはハッシュで管理しているので検索が速い
fun SetDescription() {
    val a: Set<Int> = setOf(1, 2, 3, 4, 5)

    // Setは順序を管理していないので、バラバラに表示されることがある
    for( i in 0..10){
        println(a)
    }
}

fun MutableSetDescription() {
    val b: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    b.add(6)
    // Setは順序を管理していないので、バラバラに表示されることがある
    for( i in 0..10){
        println(b)
    }
}

fun main(args: Array<String>) {
    SetDescription()
    MutableSetDescription()
}
