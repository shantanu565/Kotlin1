import java.util.*

// Write a program to find the number of occurrences of a character in a string without using loop.

fun main(){
    val sc=Scanner(System.`in`)

    println("Enter your String")
    var s1=sc.nextLine()
    println("Enter chracter to chosse ocurence")
    var s2=sc.nextLine()

    var original=s1.length
    var current=s1.replace(s2,"").length
    var newlength=original-current
    println(newlength)

}
