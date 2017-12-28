package org.chessgameai.players;

import org.chessgameai.pieces.Piece;
import org.chessgameai.Alliance;
import org.chessgameai.board.Board;

import java.util.Collection;

/**
 * Created by TheoWolf on 12/26/17.
 */
public abstract class Player {

    protected final String name;
    protected final boolean isInCheck = false; //TODO
    protected final Board board;
    protected final PlayerType playerType;

    Player(final Board board,
           final String name,
           final Collection<Piece> activePieces) {
        this.board = board;
        this.name = name;
        this.playerType = PlayerType.HUMAN;
    }

    public void timer(){
        //TODO
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public abstract Collection<Piece> getActivePieces();
    public abstract Alliance getAlliance();

}
