package baseball.domain

import baseball.OutputView
import baseball.constants.Constants
import baseball.state.BallState
import baseball.state.GameState.*

class Referee {
    private val outputView = OutputView()
    private var gameState = NORMAL
    private var ballCount = 0
    private var strikeCount = 0

    fun judge(computerBall: Ball, userBall: Ball) {
        compareUserBallToComputerBall(computerBall, userBall)
        showResult()
    }

    private fun compareUserBallToComputerBall(computerBall: Ball, userBall: Ball) {
        ballCount = 0
        strikeCount = 0

        for (i in userBall.getNumbers().indices) {
            if (isBall(compareUserNumberToComputerBall(computerBall, userBall.getNumbers()[i], i))) ballCount++
            if (isStrike(compareUserNumberToComputerBall(computerBall, userBall.getNumbers()[i], i))) strikeCount++
        }
    }

    private fun compareUserNumberToComputerBall(computerBall: Ball, number: Int, index: Int): BallState {
        var ballState = BallState.NORMAL

        if (computerBall.contains(number)) ballState = BallState.BALL
        if (computerBall.sameAs(number, index)) ballState = BallState.STRIKE

        return ballState
    }

    private fun showResult() {
        outputView.printInningResult(ballCount, strikeCount)

        if (strikeCount == Constants.BALL_NUMBER_COUNT) {
            gameState = END
            outputView.printGameEndMessage()
        }
    }

    fun isGameEnd() = gameState == END

    fun setGameStateNormal() {
        gameState = NORMAL
    }

    private fun isStrike(ballState: BallState) = ballState == BallState.STRIKE
    private fun isBall(ballState: BallState) = ballState == BallState.BALL

}