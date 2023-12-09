package baseball

import baseball.controller.BaseballGameController

class BaseballGame {
    private val baseballGameController = BaseballGameController()

    fun run() {
        generateComputerBall()
    }

    private fun generateComputerBall() {
        baseballGameController.setBall();
    }

}