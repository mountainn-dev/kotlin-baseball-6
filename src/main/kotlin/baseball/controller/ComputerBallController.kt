package baseball.controller

import baseball.constants.Constants
import baseball.domain.Ball
import camp.nextstep.edu.missionutils.Randoms

class ComputerBallController {
    private lateinit var ball: Ball

    fun getBall() = ball

    fun setBall() {
        ball = Ball(validatedBallNumbers())
    }

    private fun validatedBallNumbers(): List<Int> {
        val ballNumbers = mutableListOf<Int>()

        while (ballNumbers.distinct().size != Constants.BALL_NUMBER_COUNT) {
            ballNumbers.add(generateBallNumbers())
        }

        return ballNumbers
    }

    private fun generateBallNumbers(): Int {
        return Randoms.pickNumberInRange(Constants.MIN_BALL_NUMBER, Constants.MAX_BALL_NUMBER)
    }
}