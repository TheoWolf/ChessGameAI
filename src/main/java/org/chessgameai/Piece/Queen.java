package org.chessgameai.Piece;

import org.chessgameai.Alliance;
import org.chessgameai.board.BoardUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by TheoWolf on 12/25/17.
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
    public Collection<int[]> legalMoves() {      List<int[]> legalMoves = new ArrayList<>();
        int currentI = this.piecePosition[0];
        int currentJ = this.piecePosition[1];
        for(int i = 0; i < BoardUtils.NUM_TILES_PER_ROW; i++){
            if (i != currentI){
                legalMoves.add(new int[]{i, currentJ});
            }
        }
        for (int j = 0; j < BoardUtils.NUM_TILES_PER_COLUMN; j++){
            if (j != currentJ){
                legalMoves.add(new int[]{currentI, j});
            }
        }
        int ij = 1;
        while( currentI+ij < BoardUtils.NUM_TILES_PER_ROW
                && currentJ+ij < BoardUtils.NUM_TILES_PER_COLUMN){
            legalMoves.add(new int[]{currentI+ij, currentJ+ij});
            ij++;
        }
        ij = 1;
        while( currentI+ij < BoardUtils.NUM_TILES_PER_ROW
                && currentJ-ij >= 0){
            legalMoves.add(new int[]{currentI+ij, currentJ-ij});
            ij++;
        }
        ij = 1;
        while( currentI-ij >= 0
                && currentJ+ij < BoardUtils.NUM_TILES_PER_COLUMN){
            legalMoves.add(new int[]{currentI-ij, currentJ+ij});
            ij++;
        }
        ij = 1;
        while( currentI-ij >= 0
                && currentJ-ij >= 0){
            legalMoves.add(new int[]{currentI-ij, currentJ-ij});
            ij++;
        }
        return null;
    }
}
