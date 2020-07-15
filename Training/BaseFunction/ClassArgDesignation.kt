class ArgDesignation(id: Long, name: String){
    val id = id
    val name = name
    
    fun export(){
        println("id=${id} name=${name}")
    }
}

class ArgShortDesignation(val id: Long, val name: String){
    fun export(){
        println("id=${id} name=${name}")
    }
}

fun main(args: Array<String>) {
    val ad = ArgDesignation(123, "hogehoge")
    ad.export()

    val asd = ArgShortDesignation(456, "sampletext")
    asd.export()
}