package net.println.kotlin.chapter2

/**
 * Created by benny on 2/26/17.
 */
val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e','l','l','o','W','o','r','l','d'))

fun main(args: Array<String>) {
    println(string == fromChars)//比较字符串
    println(string === fromChars) //比较地址

    println("接下来我们要输出:" + string)

    val arg1: Int = 0
    val arg2: Int = 1
    println("" + arg1 + " + " + arg2 + " = " + (arg1 + arg2))
    println("$arg1 + $arg2 = ${arg1 + arg2}")//$没有符号

    //Hello "Trump"
    val sayHello : String = "Hello \"Trump\""
    println(sayHello)
    //salary
    val salary: Int = 1000
    //$salary
    println("\$salary")
    println("\$$salary")//$1000

    val rawString: String = """
        \t
        \n
\\\\\\$$$ salary
    """
    println(rawString)
    println(rawString.length)
}