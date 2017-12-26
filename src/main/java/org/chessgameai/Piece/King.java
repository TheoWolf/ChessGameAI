package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;

import java.util.Collection;

/**
 * Created by reda on 12/25/17.
 */
public class King extends Piece {

    public King(final Alliance alliance,
                final int[] piecePosition,
                final boolean isFirstMove) {
        super(PieceType.KING, alliance, piecePosition, isFirstMove);
    }
    public King(final Alliance alliance,
                final int[] piecePosition) {
        super(PieceType.KING, alliance, piecePosition, true);
    }
    @Override
    public Collection<int[]> legalMoves() {
        //TODO
        return null;
    }
}
