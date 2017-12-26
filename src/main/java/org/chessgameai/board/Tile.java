package org.chessgameai.board;

import org.chessgameai.Piece.Piece;

/**
 * Created by reda on 12/25/17.
 */
public abstract class Tile {

    private final int x;
    private final int y;

    private Tile(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    static Tile createTile(final int x,
                           final int y,
                           final Piece piece){
        if(piece == null){
            return new EmptyTile(x,y);
        }else{
            return new OccupiedTile(x,y,piece);
        }
    }

    public int[] getCoordinates(){
        return new int[] {x,y};
    }

    private static final class EmptyTile extends Tile {

        private EmptyTile(final int x, final int y) {
            super(x,y);
        }

        @Override
        public String toString() {
            return "-";
        }

        @Override
        public boolean isTileOccupied() {
            return false;
        }

        public Piece getPiece() {
            return null;
        }

    }

    private static final class OccupiedTile extends Tile {

        private final Piece pieceOnTile;

        private OccupiedTile(final int x,
                             final int y,
                             final Piece pieceOnTile) {
            super(x,y);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public String toString() {
            return this.pieceOnTile.getPieceAllegiance().isWhite() ?
                    this.pieceOnTile.getPieceAbv().toUpperCase() :
                    this.pieceOnTile.getPieceAbv().toLowerCase();
        }

        @Override
        public boolean isTileOccupied() {
            return true;
        }

        @Override
        public Piece getPiece() {
            return pieceOnTile;
        }
    }
}
