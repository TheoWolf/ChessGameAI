package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;

import java.util.Collection;

/**
 * Created by reda on 12/25/17.
 */
public class Bishop extends Piece{

    public Bishop(final Alliance alliance,
                final int[] piecePosition,
                final boolean isFirstMove) {
        super(PieceType.BISHOP, alliance, piecePosition, isFirstMove);
    }
    public Bishop(final Alliance alliance,
                final int[] piecePosition) {
        super(PieceType.BISHOP, alliance, piecePosition, true);
    }

    @Override
    public Collection<int[]> legalMoves() {
        //TODO
        return null;
    }
}
