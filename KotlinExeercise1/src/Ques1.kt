//import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
//import jdk.nashorn.internal.runtime.ScriptingFunctions.readLine
import java.util.*

//Write a program to replace a substring inside a string with other string.

fun main(args: Array<String>){

    val sc=Scanner(System.`in`)
    println("hello")
    println("Input your String")
    var s1=sc.nextLine()

    println("Input your subString")
    var s2=sc.nextLine()
    println("Input your subString")
    var s3=sc.nextLine()

    s1=s1.replace(s2,s3)
    println(s1)

    sc.close()

}
