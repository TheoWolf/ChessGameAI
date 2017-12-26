package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;

import java.util.Collection;

/**
 * Created by reda on 12/25/17.
 */
public class Knight extends Piece {

    public Knight(final Alliance alliance,
                final int[] piecePosition,
                final boolean isFirstMove) {
        super(PieceType.KNIGHT, alliance, piecePosition, isFirstMove);
    }
    public Knight(final Alliance alliance,
                final int[] piecePosition) {
        super(PieceType.KNIGHT, alliance, piecePosition, true);
    }

    @Override
    public Collection<int[]> legalMoves() {
        //TODO
        return null;
    }
}
