package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;
import org.chessgameai.board.BoardUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by TheoWolf on 12/25/17.
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
        List<int[]> legalMoves = new ArrayList<>();
        int currentI = this.piecePosition[0];
        int currentJ = this.piecePosition[1];
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
        return legalMoves;
    }
}
