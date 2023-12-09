package baseball.domain

class Ball(private val numbers: List<Int>) {

    fun firstNumber(): Int {
        return numbers[0]
    }

    fun secondNumber(): Int {
        return numbers[1]
    }

    fun thirdNumber(): Int {
        return numbers[2]
    }
}