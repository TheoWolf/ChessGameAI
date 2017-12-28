package org.chessgameai.players;

import org.chessgameai.moves.Move;
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
    protected final Collection<Move> legalMoves;

    Player(final Board board,
           final String name,
           final Collection<Move> legalMoves) {
        this.board = board;
        this.name = name;
        this.legalMoves = legalMoves;
        this.playerType = PlayerType.HUMAN;
    }

    public void timer(){
        //TODO
    }

    public PlayerType getPlayerType() {
        return this.playerType;
    }

    public Collection<Move> getLegalMoves() { return this.legalMoves; }

    public abstract Collection<Piece> getActivePieces();
    public abstract Alliance getAlliance();
    public abstract Alliance getOpponent();

}
