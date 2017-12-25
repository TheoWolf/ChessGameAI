package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;

import java.util.Arrays;

/**
 * Created by reda on 12/25/17.
 */
public abstract class Piece {

    final PieceType pieceType;
    final Alliance pieceAlliance;
    final int[] piecePosition;
    private final boolean isFirstMove;

    public Piece(final PieceType type,
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

}
