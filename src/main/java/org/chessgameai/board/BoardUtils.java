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
    public static final int TIME_GAME = 1000*60*60;// an hour in ms

}
