package org.chessgameai.Piece;

import org.chessgameai.Alliance;
import org.junit.Test;

import java.util.Collection;

/**
 * Created by reda on 12/27/17.
 */
public class KnightTest {


    @Test
    public void legalMovesTest() throws Exception {
        Knight kWhite = new Knight(Alliance.WHITE, new int[]{0,1});
        Collection<int[]> moves = kWhite.legalMoves();
    }
}