package org.chessgameai.pieces;

/**
 * Created by reda on 12/25/17.
 */
public enum PieceType {

    PAWN("PAWN","P"){
        @Override
        public boolean isPawn() { return true; }

        @Override
        public boolean isQueen() { return false; }

        @Override
        public boolean isKing() { return false; }

        @Override
        public boolean isRook() { return false; }

        @Override
        public boolean isKnight() { return false; }

        @Override
        public boolean isBishop() { return false; }
    },
    KNIGHT("KNIGHT","K"){
        @Override
        public boolean isPawn() { return false; }

        @Override
        public boolean isQueen() { return false; }

        @Override
        public boolean isKing() { return false; }

        @Override
        public boolean isRook() { return false; }

        @Override
        public boolean isKnight() { return true; }

        @Override
        public boolean isBishop() { return false; }
    },
    ROOK("ROOK","R"){
        @Override
        public boolean isPawn() { return false; }

        @Override
        public boolean isQueen() { return false; }

        @Override
        public boolean isKing() { return false; }

        @Override
        public boolean isRook() { return true; }

        @Override
        public boolean isKnight() { return false; }

        @Override
        public boolean isBishop() { return false; }
    },
    QUEEN("QUEEN","Q"){
        @Override
        public boolean isPawn() { return false; }

        @Override
        public boolean isQueen() { return true; }

        @Override
        public boolean isKing() { return false; }

        @Override
        public boolean isRook() { return false; }

        @Override
        public boolean isKnight() { return false; }

        @Override
        public boolean isBishop() { return false; }
    },
    KING("KING","K"){
        @Override
        public boolean isPawn() { return false; }

        @Override
        public boolean isQueen() { return false; }

        @Override
        public boolean isKing() { return false; }

        @Override
        public boolean isRook() { return false; }

        @Override
        public boolean isKnight() { return true; }

        @Override
        public boolean isBishop() { return false; }
    },
    BISHOP("BISHOP","B"){
        @Override
        public boolean isPawn() { return false; }

        @Override
        public boolean isQueen() { return false; }

        @Override
        public boolean isKing() { return false; }

        @Override
        public boolean isRook() { return false; }

        @Override
        public boolean isKnight() { return false; }

        @Override
        public boolean isBishop() { return true; }
    };

    private final String pieceName;
    private final String pieceAbr;

    PieceType(final String pieceName,
              final String pieceAbr){
        this.pieceName = pieceName;
        this.pieceAbr = pieceAbr;
    }

    public String getPieceName(){ return this.pieceName; }

    @Override
    public String toString(){ return this.pieceAbr; }

    public abstract boolean isPawn();
    public abstract boolean isQueen();
    public abstract boolean isKing();
    public abstract boolean isRook();
    public abstract boolean isKnight();
    public abstract boolean isBishop();
    //public abstract int[] intiCoordinate();
}
