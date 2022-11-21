fun main(args: Array<String> ) {
    val numbers = intArrayOf(70, 86, 5, 3, 1, 3)
    val smallestNumber = Array.stream(numbers).min().asInt
    println("Smallest number= $smallestNumber")



}