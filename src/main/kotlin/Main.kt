//Main fuction, that function will run our code
fun main() {
    theClearGuy()
    println("Hi i'll tell you if a number is zero or not.")
    print("Press enter to continue.")
    val i = readLine()
    if (i == "") {
        //calling clear guy
        theClearGuy()
    } else {
        //calling clear guy
        theClearGuy()
    }

    println("Digit the number: ")

    //reading println
    val num = readln()

    theGuyWhoChecksTheNumber(num.toInt())
}

fun theGuyWhoChecksTheNumber (n: Int) {
    //another call to clear guy
    theClearGuy()
    if (n == 0) {
        //smart
        return println("It's 0")
    } else if (n != 0) {
        //dumb
        return println("It's not 0")
    }
}
/*
simulating a console.clear(), bc System.out.exec("cls") don't work in IDE
*/
fun theClearGuy() {
    for (x in 10000 downTo 0 step 1) println();
}
