package baseball.domain

import baseball.state.ProgramState.*

class Command(private val value: Int) {

    init {
        require(value in 1..2)
    }

    fun isRestart() = value == RESTART.value
}