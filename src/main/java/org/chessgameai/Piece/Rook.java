package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;

import java.util.Collection;

/**
 * Created by reda on 12/25/17.
 */
public class Rook extends Piece {

    public Rook(final Alliance alliance,
                final int[] piecePosition,
                final boolean isFirstMove) {
        super(PieceType.ROOK, alliance, piecePosition, isFirstMove);
    }
    public Rook(final Alliance alliance,
                final int[] piecePosition) {
        super(PieceType.ROOK, alliance, piecePosition, true);
    }

    @Override
    public Collection<int[]> legalMoves() {
        //TODO
        return null;
    }
}
