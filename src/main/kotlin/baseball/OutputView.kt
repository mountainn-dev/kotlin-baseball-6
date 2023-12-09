package baseball

import baseball.constants.Request
import baseball.constants.Result

class OutputView {

    fun printRequestBallNumbersMessage() {
        print(Request.REQUEST_BALL_NUMBERS_MESSAGE)
    }

    fun printRequestCommandNumberMessage() {
        println(Request.REQUEST_COMMAND_NUMBER_MESSAGE)
    }

    fun printInningResult(ballCount: Int, strikeCount: Int) {
        if (ballCount == ZERO && strikeCount == ZERO) println(Result.NOTHING_MESSAGE)
        else {
            printBallStrikeCountMessage(ballCount, strikeCount)
        }
    }

    private fun printBallStrikeCountMessage(ballCount: Int, strikeCount: Int) {
        if (ballCount != ZERO && strikeCount != ZERO) {
            println(
                String.format(
                    Result.BALL_COUNT_MESSAGE,
                    ballCount
                ) + BLANK + String.format(Result.STRIKE_COUNT_MESSAGE, strikeCount)
            )
        } else if (ballCount != ZERO) {
            println(String.format(Result.BALL_COUNT_MESSAGE, ballCount))
        } else {
            println(String.format(Result.STRIKE_COUNT_MESSAGE, strikeCount))
        }
    }

    fun printGameEndMessage() {
        println(Result.GAME_END_MESSAGE)
    }

    companion object {
        private const val BLANK = " "
        private const val ZERO = 0
    }
}