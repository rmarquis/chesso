package com.github.zsoltk.rf1.model.board

import com.github.zsoltk.rf1.model.piece.Piece
import com.github.zsoltk.rf1.model.piece.Set
import com.github.zsoltk.rf1.model.piece.Set.BLACK
import com.github.zsoltk.rf1.model.piece.Set.WHITE

data class Square(
    val position: Position,
    val piece: Piece? = null
) {

    val file: Int =
        position.file

    val rank: Int =
        position.rank

    val isDark: Boolean =
        position.isDark()

    val isEmpty: Boolean
        get() = piece == null

    val isNotEmpty: Boolean
        get() = !isEmpty

    fun hasPiece(set: Set): Boolean =
        piece?.set == set

    val hasWhitePiece: Boolean
        get() = piece?.set == WHITE

    val hasBlackPiece: Boolean
        get() = piece?.set == BLACK

    override fun toString(): String =
        File.values()[file - 1].toString() + rank.toString()
}
