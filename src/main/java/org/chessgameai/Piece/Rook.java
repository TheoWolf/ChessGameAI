package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;
import org.chessgameai.board.BoardUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
        List<int[]> legalMoves = new ArrayList<>();
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
        return legalMoves;
    }
}
