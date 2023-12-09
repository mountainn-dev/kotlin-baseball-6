package baseball.controller

import baseball.constants.Constants
import baseball.domain.Ball
import camp.nextstep.edu.missionutils.Randoms

class BaseballGameController {
    private lateinit var ball: Ball

    fun setBall() {
        ball = Ball(generateBallNumbers())
    }

    private fun generateBallNumbers(): List<Int> {
        return Randoms.pickUniqueNumbersInRange(
            Constants.MAX_BALL_NUMBER, Constants.MAX_BALL_NUMBER, Constants.BALL_NUMBER_COUNT
        )
    }
}