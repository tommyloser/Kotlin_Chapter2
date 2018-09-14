package net.println.kotlin.chapter2

/**
 * Created by benny on 2/26/17.
 */
val aChar: Char = '0'
val bChar: Char = '中'
val cChar: Char = '\u000f'//转义字符

fun main(args: Array<String>) {
    println(aChar)
    println(bChar)
    println(cChar)
}
