fun export(s:String?){
  println(s)
  if (s != null ){
    println(s.length)
  }else{
    println("this word is null")
  }

  // 上記相当のことを下記一行で記載できる
  println(s?.length)
}

fun main(args: Array<String>) {
  var a: String = "Hello"
  export(a)

  a = "Goodbye"
  export(a)

  //a = null // compile error
  //export(a)

  var b: String? = "Hello"
  export(b)

  b = "Goodbye"
  export(b)

  b = null
  export(b)
}
