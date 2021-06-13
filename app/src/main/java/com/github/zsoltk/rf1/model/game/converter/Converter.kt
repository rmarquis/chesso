package com.github.zsoltk.rf1.model.game.converter

import com.github.zsoltk.rf1.model.game.state.GameState

interface Converter {

    fun import(text: String): GameState

    fun export(gameState: GameState): String
}

