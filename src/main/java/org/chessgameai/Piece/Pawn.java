package org.chessgameai.Piece;

import org.chessgameai.Alliance;
import org.chessgameai.board.BoardUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by TheoWolf on 12/25/17.
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
        int y = this.piecePosition[0];//Pawn only vertically (Attack off)
        int x = this.piecePosition[1];
        int DIRECTION = this.pieceAlliance.getDirection();//+1 for WHITE and -1 for BLACK
        if (isFirstMove()) {
            legalMoves.add(new int[]{y+(DIRECTION*2), x});
        }
        if (y+(DIRECTION*1) < BoardUtils.NUM_TILES_PER_COLUMN
                && y+(DIRECTION*1) >= 0) {
            legalMoves.add(new int[]{y+(DIRECTION*1), x});
        }
        return legalMoves;
    }
}
