package org.chessgameai.board;

/**
 * Created by reda on 12/25/17.
 */
public final class Board {

    private Board(final Builder builder) {

    }

    public static Board createInitialBoard(){
        final Builder builder = new Builder();
        //Set White pieces

        return builder.build();
    }

    public static class Builder {
        public Board build() { return new Board(this); }
    }
}
