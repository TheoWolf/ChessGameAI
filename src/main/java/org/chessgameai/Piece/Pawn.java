package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;
import org.chessgameai.board.BoardUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
        List<int[]> legalMoves =  new ArrayList<>();
        if (isFirstMove()) {
            legalMoves.add(new int[]{this.piecePosition[0] + (this.pieceAlliance.getDirection() * 2), this.piecePosition[1]});
        }
        if (this.piecePosition[0]+(this.pieceAlliance.getDirection()*1) < BoardUtils.NUM_TILES_PER_ROW
                && this.piecePosition[0]+(this.pieceAlliance.getDirection()*1) > 0) {
            legalMoves.add(new int[]{this.piecePosition[0] + (this.pieceAlliance.getDirection() * 1), this.piecePosition[1]});
        }
        return legalMoves;
    }
}
