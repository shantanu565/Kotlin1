import java.util.*

//Check letter in string which do not have pair.
 val str1 = "apple"
    val str2 = "banana"
    val str3 = "@"

    println(str1.add(str3.multiply(5), str2))
}

fun String.multiply(number: Int): String {
    var str = this
    for (i in 1 until number)
        str += this
    return str
}

fun String.add(str1: String, str2: String): String {
    return this + str1 + str2



}
