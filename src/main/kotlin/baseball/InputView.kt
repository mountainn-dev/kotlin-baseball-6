package baseball

import camp.nextstep.edu.missionutils.Console

class InputView {
    private val inputValidator = InputValidator()

    fun readNumbers() = validatedNumbers(read())

    fun readNumber() = validatedNumber(read())

    private fun validatedNumbers(input: String): List<Int> {
        inputValidator.checkIsNotBlank(input)
        inputValidator.checkIsDigit(input)

        return input.map { Character.getNumericValue(it) }
    }

    private fun validatedNumber(input: String): Int {
        inputValidator.checkIsNotBlank(input)
        inputValidator.checkIsDigit(input)

        return Integer.parseInt(input)
    }

    private fun read() = Console.readLine()
}