package net.println.kotlin.chapter2

/**
 * Created by benny on 2/26/17.
 *
 */
fun main(args: Array<String>) {
//    val parent: Parent = Parent()
    val parent: Parent = Child()
    if (parent is Child) { //这里告诉编译器parent 的子类型
        println(parent.name)//这里不用强转就可以调用child 方法
    }

    val string: String? = "Hello"
//    if(string != null)
    if(string is String)// 这里告诉了编译器不为空
        println(string.length)

    val parent2: Parent = Parent()
//    val child2: Child? = parent2 as Child //类型强转，转化失败就异常
    val child2: Child? = parent2 as? Child //安全类型强转， 失败返回null
    println(child2)
}