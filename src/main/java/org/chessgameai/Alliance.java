package org.chessgameai;

import org.chessgameai.players.BlackPlayer;
import org.chessgameai.players.Player;
import org.chessgameai.players.WhitePlayer;

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
        public Player getPlayerByAlliance(WhitePlayer whitePlayer,
                                          BlackPlayer blackPlayer) {
            return whitePlayer;
        }

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
        public int getOppositeDirection() { return UP_DIRECTION; }

        @Override
        public Player getPlayerByAlliance(WhitePlayer whitePlayer,
                                          BlackPlayer blackPlayer) {
            return blackPlayer;
        }

        @Override
        public String toString(){ return "Black"; }
    };

    public abstract boolean isWhite();

    public abstract boolean isBlack();

    public abstract int getDirection();

    public abstract int getOppositeDirection();

    public abstract Player getPlayerByAlliance(final WhitePlayer whitePlayer,
                                               final BlackPlayer blackPlayer);

    private static final int UP_DIRECTION = 1;

    private static final int DOWN_DIRECTION = -1;

}
