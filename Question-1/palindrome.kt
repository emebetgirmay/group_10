fun main() {
    println(isPalindrome("hannah")) // true
    println(isPalindrome("process")) // false
}


fun isPalindrome(s: String): Boolean {
    val cleanS = s.lowercase().filter { it.isLetterOrDigit() }
    return cleanS == cleanS.reversed()
}
