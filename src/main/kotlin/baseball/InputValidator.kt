package baseball

class InputValidator {

    fun checkIsNotBlank(input: String) {
        require(input.isNotBlank())
    }

    fun checkIsDigit(input: String) {
        require(!input.map { it.isDigit() }.contains(false))
    }
}