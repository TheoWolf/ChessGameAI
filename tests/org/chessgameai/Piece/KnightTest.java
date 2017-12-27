package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

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