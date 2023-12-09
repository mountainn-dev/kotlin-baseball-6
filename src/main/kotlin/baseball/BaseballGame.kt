package baseball

import baseball.controller.BaseballGameController
import baseball.controller.ComputerBallController
import baseball.controller.UserBallController
import baseball.domain.Referee

class BaseballGame {
    private val baseballGameController = BaseballGameController()
    private val computerBallController = ComputerBallController()
    private val userBallController = UserBallController()
    private val referee = Referee()

    fun run() {
        do {
            playGame()
            baseballGameController.setCommand()
        } while (baseballGameController.isGameRestarted())
    }

    private fun playGame() {
        reset()

        while (!referee.isGameEnd()) {
            generateUserBall()
            judge()
        }
    }

    private fun reset() {
        referee.setGameStateNormal()
        computerBallController.setBall()
    }

    private fun generateUserBall() {
        userBallController.setBall()
    }

    private fun judge() {
        referee.judge(computerBallController.getBall(), userBallController.getBall())
    }

}