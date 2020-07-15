class SeterGetter {
    var number: Long = 0
    var book: String = "magazine" // initializer is not allowed here because this property has no backing field

    //set(value){
    //    $number = value     //    expecting an element
    //    number = value     //    expecting an element
    //}
    //get(){
    //    return $number
    //    return number
    //}
}

fun main(args: Array<String>) {
    //val sg = SeterGetter()
    //sg.set(100)
    //val number = sg.get()
    //println(number)

}