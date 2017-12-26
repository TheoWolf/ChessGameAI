package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;

import java.util.Collection;

/**
 * Created by reda on 12/25/17.
 */
public class Queen extends Piece {
    public Queen(final Alliance alliance,
                final int[] piecePosition,
                final boolean isFirstMove) {
        super(PieceType.QUEEN, alliance, piecePosition, isFirstMove);
    }
    public Queen(final Alliance alliance,
                final int[] piecePosition) {
        super(PieceType.QUEEN, alliance, piecePosition, true);
    }

    @Override
    public Collection<int[]> legalMoves() {
        //TODO
        return null;
    }
}
