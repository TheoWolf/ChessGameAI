package org.chessgameai.Piece;

import com.sun.tools.doclint.Entity;
import org.chessgameai.board.Alliance;
import org.chessgameai.board.BoardUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
        List<int[]> legalMoves =  new ArrayList<>();
        int currentY = this.piecePosition[0];
        int currentX = this.piecePosition[1];
        int DIRECTION = this.pieceAlliance.getDirection();//Direction
        int OPPOSITE_DIRECTION = this.pieceAlliance.getOppositeDirection();//Opposite Direction
        //Bugz 1: Wrong if Statement for possible moves of the knight
        if(currentX+2 < BoardUtils.NUM_TILES_PER_ROW
                && currentX-2 >= 0
                && currentY+2 < BoardUtils.NUM_TILES_PER_COLUMN
                && currentY-2 >= 0){
            legalMoves.add(new int[]{currentY+2, currentX+1});
            legalMoves.add(new int[]{currentY+2, currentX-1});
            legalMoves.add(new int[]{currentY-2, currentX+1});
            legalMoves.add(new int[]{currentY-2, currentX-1});
            legalMoves.add(new int[]{currentY+1, currentX+2});
            legalMoves.add(new int[]{currentY+1, currentX-2});
            legalMoves.add(new int[]{currentY-1, currentX+2});
            legalMoves.add(new int[]{currentY-1, currentX-2});
        }else if(currentX+2 < BoardUtils.NUM_TILES_PER_ROW
                && currentX-2 >= 0
                && currentY+2 < BoardUtils.NUM_TILES_PER_COLUMN){
            if (currentY-1 >= 0) {
                legalMoves.add(new int[]{currentY + 2, currentX + 1});
                legalMoves.add(new int[]{currentY + 2, currentX - 1});
                legalMoves.add(new int[]{currentY + 1, currentX + 2});
                legalMoves.add(new int[]{currentY + 1, currentX - 2});
                legalMoves.add(new int[]{currentY - 1, currentX + 2});
                legalMoves.add(new int[]{currentY - 1, currentX - 2});
            }else{
                legalMoves.add(new int[]{currentY + 2, currentX + 1});
                legalMoves.add(new int[]{currentY + 2, currentX - 1});
                legalMoves.add(new int[]{currentY + 1, currentX + 2});
                legalMoves.add(new int[]{currentY + 1, currentX - 2});
            }
        }else if(currentX+2 < BoardUtils.NUM_TILES_PER_ROW
                && currentX-2 >= 0
                && currentY-2 >= 0){
            if (currentY+1 < BoardUtils.NUM_TILES_PER_COLUMN) {
                legalMoves.add(new int[]{currentY - 2, currentX + 1});
                legalMoves.add(new int[]{currentY - 2, currentX - 1});
                legalMoves.add(new int[]{currentY + 1, currentX + 2});
                legalMoves.add(new int[]{currentY + 1, currentX - 2});
                legalMoves.add(new int[]{currentY - 1, currentX + 2});
                legalMoves.add(new int[]{currentY - 1, currentX - 2});
            }else{
                legalMoves.add(new int[]{currentY - 2, currentX + 1});
                legalMoves.add(new int[]{currentY - 2, currentX - 1});
                legalMoves.add(new int[]{currentY - 1, currentX + 2});
                legalMoves.add(new int[]{currentY - 1, currentX - 2});
            }
        }else if (currentX+2 < BoardUtils.NUM_TILES_PER_ROW
                && currentY+2 < BoardUtils.NUM_TILES_PER_COLUMN
                && currentY-2 >= 0){
            if(currentX-1 >= 0) {
                legalMoves.add(new int[]{currentY + 2, currentX + 1});
                legalMoves.add(new int[]{currentY + 2, currentX - 1});
                legalMoves.add(new int[]{currentY - 2, currentX + 1});
                legalMoves.add(new int[]{currentY - 2, currentX - 1});
                legalMoves.add(new int[]{currentY + 1, currentX + 2});
                legalMoves.add(new int[]{currentY - 1, currentX + 2});
            }else{
                legalMoves.add(new int[]{currentY + 2, currentX + 1});
                legalMoves.add(new int[]{currentY - 2, currentX + 1});
                legalMoves.add(new int[]{currentY + 1, currentX + 2});
                legalMoves.add(new int[]{currentY - 1, currentX + 2});
            }
        }else if (currentX-2 >= 0
                && currentY+2 < BoardUtils.NUM_TILES_PER_COLUMN
                && currentY-2 >= 0){
            if(currentX+1 < BoardUtils.NUM_TILES_PER_ROW) {
                legalMoves.add(new int[]{currentY + 2, currentX + 1});
                legalMoves.add(new int[]{currentY + 2, currentX - 1});
                legalMoves.add(new int[]{currentY - 2, currentX + 1});
                legalMoves.add(new int[]{currentY - 2, currentX - 1});
                legalMoves.add(new int[]{currentY + 1, currentX - 2});
                legalMoves.add(new int[]{currentY - 1, currentX - 2});
            }else{
                legalMoves.add(new int[]{currentY + 2, currentX - 1});
                legalMoves.add(new int[]{currentY - 2, currentX - 1});
                legalMoves.add(new int[]{currentY + 1, currentX - 2});
                legalMoves.add(new int[]{currentY - 1, currentX - 2});
            }
        }
        return legalMoves;
    }
}
