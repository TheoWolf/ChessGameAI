package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;
import org.chessgameai.board.BoardUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by TheoWolf on 12/25/17.
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
        List<int[]> legalMoves =  new ArrayList<>();
        int currentI = this.piecePosition[0];
        int currentJ = this.piecePosition[1];
        if(currentI+1 < BoardUtils.NUM_TILES_PER_COLUMN){
            legalMoves.add(new int[]{currentI+1,currentJ});
        }
        if (currentI-1 >= 0) {
            legalMoves.add(new int[]{currentI-1,currentJ});
        }
        if (currentI+1 < BoardUtils.NUM_TILES_PER_COLUMN
                && currentJ+1 <BoardUtils.NUM_TILES_PER_ROW){
            legalMoves.add(new int[]{currentI+1,currentJ+1});
        }
        if (currentI+1 < BoardUtils.NUM_TILES_PER_COLUMN
                && currentJ-1 >= 0) {
            legalMoves.add(new int[]{currentI+1,currentJ-1});
        }
        if (currentJ-1 >= 0) {
            legalMoves.add(new int[]{currentI,currentJ-1});
        }
        if (currentJ+1 < BoardUtils.NUM_TILES_PER_ROW) {
            legalMoves.add(new int[]{currentI,currentJ+1});
        }
        if (currentI-1 >= 0
                && currentJ+1 <BoardUtils.NUM_TILES_PER_ROW) {
            legalMoves.add(new int[]{currentI-1,currentJ+1});
        }
        if (currentI-1 >= 0
                && currentJ-1 >= 0) {
            legalMoves.add(new int[]{currentI-1,currentJ-1});
        }
        return legalMoves;
    }
}
