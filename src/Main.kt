import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
    println("Hello World!")
    println("This is me using kotlin")

    variables()

    val saujanyIntro: String = booleans()

    println(saujanyIntro)
}

fun variables() {
    var x: Long = 3L
    println("The value of x is $x")
    x=4

    println("The value of x is now $x")

}

fun differentVariables() {
    val wholeNumber: Int = 3
    var bigNumber: Long = 3L
    val preciseDecimal: Double = 3.33
    val decimal: Float = 3.33f
    val iLoveChicken: Boolean = false
    val iLovePhoa: Boolean = true
}

fun numbericalOperations() {
    var x: Float = 3/4f
    println("The value id $x")
    x = 3 / 4f
    println("New value is also same: $x")
}

fun booleans(): String {
    val amIAnAdult: Boolean = true
    val amIAProgrammer: Boolean = true
    val amIARobot: Boolean = false

    var finalStatement: String = "Saujanya is "

    if (amIARobot) {
        finalStatement = finalStatement+"a Robot, "
    } else {
        finalStatement = finalStatement+"not a Robot, "
    }

    if (amIAProgrammer) finalStatement = finalStatement+"a Programmer, " else finalStatement = finalStatement+"not a Programmer, "

    if (amIAnAdult) {
        finalStatement += "a Adult, "
    } else {
        finalStatement += "not a Adult, "
    }

    return finalStatement
}