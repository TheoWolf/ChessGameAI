package org.chessgameai.players;

import org.chessgameai.Piece.Piece;
import org.chessgameai.board.Alliance;

import java.util.Collection;

/**
 * Created by reda on 12/26/17.
 */
public abstract class Player {

    protected final String name;
    protected final boolean isInCheck = false;

    Player(final String name,
           final Collection<Piece> activePieces) {
        this.name = name;
    }

    //implement a timer for each player

    public abstract Collection<Piece> getActivePieces();
    public abstract Alliance getAlliance();



}
