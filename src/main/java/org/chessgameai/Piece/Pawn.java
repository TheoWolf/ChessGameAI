package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;

import java.util.Collection;

/**
 * Created by reda on 12/25/17.
 */
public class Pawn extends Piece {

    public Pawn(final Alliance alliance,
                final int[] piecePosition,
                final boolean isFirstMove) {
        super(PieceType.PAWN, alliance, piecePosition, isFirstMove);
    }

    public Pawn(final Alliance alliance,
                final int[] piecePosition) {
        super(PieceType.PAWN, alliance, piecePosition, true);
    }

    @Override
    public Collection<int[]> legalMoves() {
        return null;
    }
}
