package baseball.domain

import baseball.constants.Constants

class Ball(private val numbers: List<Int>) {

    init {
        require(numbers.size == Constants.BALL_NUMBER_COUNT)
        require(numbers.distinct().size == numbers.size)
        require(!numbers.map { it in Constants.MIN_BALL_NUMBER..Constants.MAX_BALL_NUMBER }.contains(false))
    }

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