fun main() {
    val secret = (1..100).random()

    print("Your guess: ")
    val guess = readln().toInt()

    val message = when {
        guess < secret -> "Too low!"
        guess > secret -> "Too high!"
        else -> "Correct!"
    }

    println(message)
}