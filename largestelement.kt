import java.util.Arrays

fun main(args: Array<String> ) {
    val numbers = intArrayOf(70, 86, 5, 3, 1, 3)
    val largestNumber = Arrays.stream(numbers).max().asInt
    println("largest number= $largestNumber")



}