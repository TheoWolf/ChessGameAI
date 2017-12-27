package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;
import org.chessgameai.board.BoardUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by TheoWolf on 12/25/17.
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
        List<int[]> legalMoves =  new ArrayList<>();
        int currentI = this.piecePosition[0];
        int currentJ = this.piecePosition[1];
        if (currentI+2 < BoardUtils.NUM_TILES_PER_COLUMN && currentJ+1 < BoardUtils.NUM_TILES_PER_ROW){
            legalMoves.add(new int[]{currentI+2, currentJ+1});
        }
        if (currentI+2 < BoardUtils.NUM_TILES_PER_COLUMN && currentJ-1 >=0){
            legalMoves.add(new int[]{currentI+2, currentJ-1});
        }
        if (currentI-2 >= 0  && currentJ+1 < BoardUtils.NUM_TILES_PER_ROW){
            legalMoves.add(new int[]{currentI-2, currentJ+1});
        }
        if (currentI-2 >= 0  && currentJ-1 >= 0) {
            legalMoves.add(new int[]{currentI-2, currentJ-1});
        }
        if (currentI+1 < BoardUtils.NUM_TILES_PER_COLUMN && currentJ+2 < BoardUtils.NUM_TILES_PER_ROW){
            legalMoves.add(new int[]{currentI+1, currentJ+2});
        }
        if (currentI+1 < BoardUtils.NUM_TILES_PER_COLUMN && currentJ-2 >= 0) {
            legalMoves.add(new int[]{currentI+1, currentJ-2});
        }
        if (currentI-1 >= 0 && currentJ+2 < BoardUtils.NUM_TILES_PER_ROW){
            legalMoves.add(new int[]{currentI-1, currentJ+2});
        }
        if (currentI-1 >= 0 && currentJ-2 >= 0){
            legalMoves.add(new int[]{currentI-1, currentJ-2});
        }
        return legalMoves;
    }
}
