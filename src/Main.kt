import java.io.File

fun main() {

}
//1
fun findLargest(x: Int, y: Int, z: Int): Int {
    if (x > y && x > z)
        return x
    else if (y > x && y > z)
        return y
    else
        return z
}
//8
fun reverseArray(x: Array<Any>): Array<Any>? {
    var len: Int = x.size
    val result: Array<Any>? = Array(len, { i -> i })
    for (item in 0 until x.size) {
        result?.set(len - 1, value = x.get(item))
        len -= 1
    }
    return result
}
//2
fun validateDate(date: String) {
}
//3
fun multiplyMatrix(firstMatrix: Array<Int>, secondMatrix: Array<Int>): Array<Int> {
    val len1 = firstMatrix.size
    val len2 = secondMatrix.size
    val resultMatrix = arrayOf(len1)
    for (i in 0..len1 - 1) {
        for (j in 0..len2 - 1) {
            for (k in 0..len1 - 1) {
            }
        }
    }
    return resultMatrix
}
//4
fun printPascalTriangle(n: Int) {
    var digit: Int;
    for (y in 1..n) {
        digit = 1
        for (x in 1..y) {
            print("$digit  ")
            digit = digit * (y - x) / x
        }
        println()
    }
}
//5
fun readFile(fileName: String): List<String> {
    val wordsSet = mutableSetOf<String>()
    try {
        val input = File(fileName).useLines { it.toMutableList() }
        for (item in input) {
            wordsSet.add(item)
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return wordsSet.sorted()
}