package org.chessgameai.board;

import org.chessgameai.Piece.Piece;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by reda on 12/25/17.
 */
public enum BoardUtils {

    INSTANCE;

    public static final int NUM_TILES_PER_ROW = 8;
    public static final int NUM_TILES_PER_COLUMN = 8;
    public static final int NUM_TILES = 64;

    public Collection<int[]> initPosition(Piece piece){
        final List<int[]> initPositions = new ArrayList<>();
        switch (piece.getType()) {
            case PAWN:
                for (int j = 0; j < 8; j++) {
                    if (piece.getPieceAllegiance() == Alliance.WHITE) {
                        initPositions.add(new int[]{1, j});
                    } else {
                        initPositions.add(new int[]{6, j});
                    }
                }
                break;
            case QUEEN:
                if (piece.getPieceAllegiance() == Alliance.WHITE) {
                    initPositions.add(new int[]{0, 3});
                } else {
                    initPositions.add(new int[]{7, 3});
                }
                break;
            case KING:
                if (piece.getPieceAllegiance() == Alliance.WHITE) {
                    initPositions.add(new int[]{0, 4});
                } else {
                    initPositions.add(new int[]{7, 4});
                }
                break;
            case BISHOP:
                if (piece.getPieceAllegiance() == Alliance.WHITE) {
                    initPositions.add(new int[]{0, 2});
                    initPositions.add(new int[]{0, 5});
                } else {
                    initPositions.add(new int[]{7, 2});
                    initPositions.add(new int[]{7, 5});
                }
                break;
            case KNIGHT:
                if (piece.getPieceAllegiance() == Alliance.WHITE) {
                    initPositions.add(new int[]{0, 1});
                    initPositions.add(new int[]{0, 6});
                } else {
                    initPositions.add(new int[]{7, 1});
                    initPositions.add(new int[]{7, 6});
                }
                break;
            case ROOK:
                if (piece.getPieceAllegiance() == Alliance.WHITE) {
                    initPositions.add(new int[]{0, 0});
                    initPositions.add(new int[]{0, 6});
                } else {
                    initPositions.add(new int[]{7, 0});
                    initPositions.add(new int[]{7, 6});
                }
                break;

        }
        return initPositions;
    }
}
