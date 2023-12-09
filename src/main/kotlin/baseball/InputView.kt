package baseball

import camp.nextstep.edu.missionutils.Console

class InputView {
    private val inputValidator = InputValidator()

    fun readBallNumbers() = validatedBallNumbers(read())

    private fun validatedBallNumbers(input: String): List<Int> {
        inputValidator.checkIsNotBlank(input)
        inputValidator.checkIsDigit(input)

        return input.map { Character.getNumericValue(it) }
    }

    private fun read() = Console.readLine()
}