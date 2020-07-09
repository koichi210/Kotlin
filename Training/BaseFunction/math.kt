package com.taroid.sample

fun main(args: Array<String>) {
    val list = listOf(1, 1, 2, 3, 5, 8 )
 
    // 各要素を2倍
    val twice = list.map { e -> e * 2 }
    println(twice) // => [6, 10, 4, 14, 8]

    // 偶数の要素のみにフィルタリングしたリストを生成
    val even = list.filter { e -> e % 2 == 0 }
}