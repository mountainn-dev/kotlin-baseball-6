package baseball

import baseball.controller.BaseballGameController

class BaseballGame {
    private val baseballGameController = BaseballGameController()

    fun run() {

    }

    private fun generateComputerBall() {
        baseballGameController.setBall();
    }

}