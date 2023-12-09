package baseball

import baseball.controller.BaseballGameController
import baseball.controller.UserBallController

class BaseballGame {
    private val baseballGameController = BaseballGameController()
    private val userBallController = UserBallController()

    fun run() {
        generateComputerBall()
        generateUserBall()
    }

    private fun generateComputerBall() {
        baseballGameController.setBall()
    }

    private fun generateUserBall() {
        userBallController.setBall()
    }

}