package net.println.kotlin.chapter2

/**
 * Created by benny on 2/26/17.
 * String? 带代表可能为空
 * 输出 name? ,代表可能输出空
 * value!!, 可能为空，当时我确信不为空
 */
fun getName(): String?{ //可以返回null, 可是使用就需要判断， d但是判断有简便写法
//fun getName(): String{ //不可返回null
    return null
}

fun main(args: Array<String>) {
    //如果getName 为空， 返回， 否则赋值
//    val name: String = getName() ?: return
//    println(name.length)

    val value: String? = "HelloWorld"//可能为空
    println(value!!.length)// 加两个！！,告诉编译器一定不为空
//    println(value.length)


//    val name = getName()
//    //如果name 不为空，返回 length 否则null
//    println(name?.length)


}