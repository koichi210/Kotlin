fun TestScore(test: Test) {
    test.score(100)
}

open class Test(val student: String) {
    var number = 0
    open fun score(s: Int) {
        number = number + s
        println("test score is${s}-ten")
    }
}

class EnglishTest(student: String) : Test(student) {
    override fun score(s :Int) {
        number = number + s
        println("${student}-san english test score is ${s}-ten")
    }
}

class MathTest(student: String) : Test(student) {
    override fun score(s :Int) {
        number = number + s
        println("${student}-san math test score is${s}-ten")
    }
}

fun main(args: Array<String>) {
    val test1 = EnglishTest("charlie")
    val test2 = MathTest("dash")
    TestScore(test1)
    TestScore(test2)
}
