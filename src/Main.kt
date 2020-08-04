import java.io.File

fun main() {
}

//1->Find Largest
fun findLargest(x: Int, y: Int, z: Int): Int {
    if (x > y && x > z)
        return x
    else if (y > x && y > z)
        return y
    else
        return z
}


//2->Date Validation
fun validateDate(date: String): Boolean {
    var result = false
    val pattern = Regex("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})\$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))\$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})\$")
    if (pattern.matches(date))
        result = true

    return result
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


//4->print pascals triangle
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


//5->read file and remove the duplicates and print sorted
fun readFile(fileName: String) {
    val wordsSet = mutableSetOf<String>()
    try {
        val input = File(fileName).useLines { it.toMutableList() }
        for (item in input) {
            wordsSet.add(item)
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
    for (item in wordsSet.sorted())
        println(item)
}


//7-> generate Fibonacci Sequence of given integer
fun generateFibonacciSequence(n: Int) {
    var firstDigit = 0
    var secondDigit = 1
    var sum = 0
    for (item in 1..n) {
        print("$firstDigit  ")
        sum = firstDigit + secondDigit
        firstDigit = secondDigit
        secondDigit = sum
    }
}


//8 ->reverse an array of Any type
fun reverseArray(x: Array<Any>): Array<Any>? {
    var len: Int = x.size
    val result: Array<Any>? = Array(len, { i -> i })
    for (item in 0 until x.size) {
        result?.set(len - 1, value = x.get(item))
        len -= 1
    }
    return result
}


//10-> add two arrays and return reversed & sorted array
fun mergeSorted(x: Array<Int>, y: Array<Int>): Array<Int> {
    val len = x.size + y.size
    val result = Array<Int>(len, { i -> i })
    var index = 0;
    for (i in 0 until x.size) {
        result.set(index, x.get(i))
        index++
    }
    for (i in 0 until y.size) {
        result.set(index, y.get(i))
        index++
    }
    return result.sorted().reversed().toTypedArray()
}


//11 finds the second largest value of given array
fun secondLargest(inputArr: Array<Int>): Int {
    return inputArr.sorted().toTypedArray().get(inputArr.size - 2)
}


//13 checks whether an array is sorted or not
fun isSorted(inputArr: Array<Int>): Boolean {
    var result = false
    var len = inputArr.size
    if (len == 0)
        result = true
    else if (len > 0)
        for (i in 0 until len) {
            if (inputArr.get(i) == inputArr.sortedArray().get(i))
                result = true
            else
                result = false
        }

    return result
}


//15reverse elements of List
fun reverseElements(inputList: MutableList<Double>): MutableList<Double> {
    var len = inputList.size
    var result = Array(len, { i -> i.toDouble() })
    for (i in 0 until len) {
        result.set(len - 1, inputList.get(i))
        len -= 1
    }
    return result.toMutableList()
}