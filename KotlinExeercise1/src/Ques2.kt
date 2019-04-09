import java.util.*

//Write a program to find the number of occurrences of the duplicate words in a string and print them.

fun main(){
    val sc=Scanner(System.`in`)
    println("enter your string")
    var s1=sc.nextLine()
    var myarr= s1.split("")
    var frequency=hashMapOf<String,Int>()

    for (i in myarr){
        if (i !in frequency)
            frequency[i]=1
        else
            frequency[i]=frequency[i]!!+1

    }

    println("Occurance of duplicate words are:")
    for (i in frequency.keys)
        println("$i:${frequency[i]}")
}