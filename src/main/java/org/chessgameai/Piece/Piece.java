package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by reda on 12/25/17.
 */
public abstract class Piece {

    final PieceType pieceType;
    final Alliance pieceAlliance;
    final int[] piecePosition;
    private final boolean isFirstMove;

    Piece(final PieceType type,
                 final Alliance alliance,
                 final int[] piecePosition,
                 final boolean isFirstMove) {
        this.pieceType = type;
        this.pieceAlliance = alliance;
        this.piecePosition = piecePosition;
        this.isFirstMove = isFirstMove;
    }

    public PieceType getType() { return this.pieceType; }

    public Alliance getPieceAllegiance() { return this.pieceAlliance; }

    public int[] getPiecePosition() { return this.piecePosition; }

    public String getPieceName() { return this.pieceType.getPieceName(); }

    public String getPieceAbv() { return this.pieceType.toString(); }

    public boolean isFirstMove() { return this.isFirstMove; }

    public Collection<int[]> initPosition(){
        final List<int[]> initPositions = new ArrayList<>();
        switch (this.pieceType) {
            case PAWN:
                for (int j = 0; j < 8; j++) {
                    if (this.pieceAlliance == Alliance.WHITE) {
                        initPositions.add(new int[]{1, j});
                    } else {
                        initPositions.add(new int[]{6, j});
                    }
                }
                break;
            case QUEEN:
                if (this.pieceAlliance == Alliance.WHITE) {
                    initPositions.add(new int[]{0, 3});
                } else {
                    initPositions.add(new int[]{7, 3});
                }
                break;
            case KING:
                if (this.pieceAlliance == Alliance.WHITE) {
                    initPositions.add(new int[]{0, 4});
                } else {
                    initPositions.add(new int[]{7, 4});
                }
                break;
            case BISHOP:
                if (this.pieceAlliance == Alliance.WHITE) {
                    initPositions.add(new int[]{0, 2});
                    initPositions.add(new int[]{0, 5});
                } else {
                    initPositions.add(new int[]{7, 2});
                    initPositions.add(new int[]{7, 5});
                }
                break;
            case KNIGHT:
                if (this.pieceAlliance == Alliance.WHITE) {
                    initPositions.add(new int[]{0, 1});
                    initPositions.add(new int[]{0, 6});
                } else {
                    initPositions.add(new int[]{7, 1});
                    initPositions.add(new int[]{7, 6});
                }
                break;
            case ROOK:
                if (this.pieceAlliance == Alliance.WHITE) {
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

    @Override
    public String toString() {
        return "Piece{" +
                "type=" + pieceType +
                ", alliance=" + pieceAlliance +
                ", piecePosition=" + Arrays.toString(piecePosition) +
                ", isFirstMove=" + isFirstMove +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Piece)) return false;

        final Piece oPiece = (Piece) o;
        return piecePosition == oPiece.piecePosition
                && pieceAlliance == oPiece.pieceAlliance
                && piecePosition.equals(oPiece.piecePosition)
                && isFirstMove == oPiece.isFirstMove
                && pieceType == oPiece.pieceType;
    }

    public abstract Collection<int[]> legalMoves();

}
