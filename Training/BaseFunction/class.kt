class Empty {
}

class User {
    var id: Long = 0
    var name: String = "Unknown"

    override fun toString(): String {
        return " id=" + id + " name=" + name
    }
}

class Score constructor(var student: String = "", var score: Int = 0){
    fun export() {
        println("${student} is ${score}-ten")
    }
}

class ScoreInit constructor(var student: String = "", var score: Int = 0){
    // 初期化処理（CPPのコンストラクタのようなもの）
    init {
        export()
    }

    fun export() {
        println("${student} is ${score}-ten")
    }
}

//「constructor」と記載しなくても良い
class Member(var id: Int = 0, var name:String = "Unknown" ){
    fun export() {
        println("Id = ${id}, Name = ${name}")
    }
}

class SecondaryConstructor(var student: String, var score: Int){
    // セカンダリコンストラクタ
    constructor (score: Int) : this("Aさん", score) {
        println("受け取ったパラメータは${student}と${score}です。")
    }

    init {
        println("点数は以下の通りです。")
        println("${student}の点数は${score}点です。")
    }

}

fun main(args: Array<String>) {
    val empty = Empty()
    println(empty)
    

    val user = User()
    println(user) // toStringをoverrideしてる

    user.id = 123
    user.name = "kotlin"
    println(user.toString())


    val score1 = Score("Melinda", 80)
    score1.export()

    // 変数名を指定すれば、引数順は問わない
    val score2 = Score(score = 100, student = "Sum")
    score2.export()


    val scoreinit = ScoreInit("Jail", 50)   // 1回目のexport
    scoreinit.export()                      // 2回目のexport

    val member = Member(10, "Emily")
    member.export()

    val sc = SecondaryConstructor(10)
}
