import java.util.*

//Find common elements between two arrays.

fun main(){
    val sc=Scanner(System.`in`)

    println("Enter the array")
    val arr1=sc.nextLine().split("")
    println("Enter the array")
    val arr2=sc.nextLine().split("")

    val arr3= hashSetOf<String>()

    for (i in arr1) {
        for (j in arr2) {
            if (i == j)
                arr3.add(i)
        }
    }
    println(arr3)
}