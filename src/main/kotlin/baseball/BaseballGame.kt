package baseball

import baseball.controller.ComputerBallController
import baseball.controller.UserBallController
import baseball.controller.Referee

class BaseballGame {
    private val baseballGameController = ComputerBallController()
    private val userBallController = UserBallController()
    private val referee = Referee()

    fun run() {
        generateComputerBall()

        while (!referee.isGameEnd()) {
            generateUserBall()
            judge()
        }
    }

    private fun generateComputerBall() {
        baseballGameController.setBall()
    }

    private fun generateUserBall() {
        userBallController.setBall()
    }

    private fun judge() {
        referee.judge(baseballGameController.getBall(), userBallController.getBall())
    }

}