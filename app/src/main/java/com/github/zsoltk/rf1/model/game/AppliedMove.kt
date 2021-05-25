package com.github.zsoltk.rf1.model.game

import com.github.zsoltk.rf1.model.move.CalculatedMove

data class AppliedMove(
    val move: CalculatedMove,
    val updatedCurrentState: GameState,
    val newState: GameState
)
