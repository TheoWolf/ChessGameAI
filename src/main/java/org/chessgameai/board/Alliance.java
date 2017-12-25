package org.chessgameai.board;

/**
 * Created by reda on 12/25/17.
 */
public enum Alliance {

    WHITE(){
        @Override
        public boolean isWhite() { return true; }

        @Override
        public boolean isBlack() { return false; }

        @Override
        public int getDirection() { return UP_DIRECTION;}

        @Override
        public int getOppositeDirection() { return DOWN_DIRECTION; }

        @Override
        public String toString(){ return "White"; }
    },
    BLACK(){
        @Override
        public boolean isWhite() { return false; }

        @Override
        public boolean isBlack() { return true; }

        @Override
        public int getDirection() { return DOWN_DIRECTION; }

        @Override
        public int getOppositeDirection() {return UP_DIRECTION; }

        @Override
        public String toString(){ return "Black"; }
    };

    public abstract boolean isWhite();

    public abstract boolean isBlack();

    public abstract int getDirection();

    public abstract int getOppositeDirection();

    private static final int UP_DIRECTION = 1;

    private static final int DOWN_DIRECTION = -1;
}
