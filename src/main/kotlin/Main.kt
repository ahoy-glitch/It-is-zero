var number: Int = 35 + 34


fun main() {
    theClearGuy()
    println("Hi i'll tell you if a number is zero or not.\n")
    print("Press enter to continue.")
    val i = readLine()
    if (i == "") theClearGuy()

    println("Digit the number: ")
    val num = readln()

    theGuyWhoChecksTheNumber(num.toInt())
}

fun theGuyWhoChecksTheNumber (n: Int) {
    theClearGuy()
    if (n == 0) {
        //smart
        return println("It's 0")
    } else if (n != 0) {
        //dumb
        return println("It's not 0")
    }
}

fun theClearGuy() {
    for (x in 50 downTo 0 step 1) println();
}

