package baseball.controller

import baseball.InputView
import baseball.OutputView
import baseball.domain.Command

class BaseballGameController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private lateinit var command: Command

    fun setCommand() {
        requestUserCommand()
        command = Command(commandNumberFromUser())
    }

    private fun requestUserCommand() {
        outputView.printRequestCommandNumberMessage()
    }

    private fun commandNumberFromUser() = inputView.readNumber()

    fun isGameRestarted() = command.isRestart()
}