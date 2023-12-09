package baseball.controller

import baseball.InputView
import baseball.OutputView
import baseball.domain.Ball

class UserBallController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private lateinit var ball: Ball

    fun getBall() = ball

    fun setBall() {
        requestBallNumbers()
        ball = Ball(ballNumbersFromUser())
    }

    private fun requestBallNumbers() {
        outputView.printRequestBallNumbersMessage()
    }

    private fun ballNumbersFromUser() = inputView.readBallNumbers()
}