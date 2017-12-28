package org.chessgameai.players;

import org.chessgameai.pieces.Piece;
import org.chessgameai.Alliance;
import org.chessgameai.board.Board;

import java.util.Collection;

/**
 * Created by TheoWolf on 12/26/17.
 */
public final class WhitePlayer extends Player {
    public WhitePlayer(final Board board,
                       final String name,
                       final Collection<Piece> activePieces) {
        super(board, name,activePieces);
    }

    public WhitePlayer(final Board board,
                       final Collection<Piece> activePieces) {
        super(board, "Player1",activePieces);
    }

    @Override
    public Collection<Piece> getActivePieces() {
        return this.board.getWhiteActivePieces();
    }

    @Override
    public Alliance getAlliance() { return Alliance.WHITE; }

    @Override
    public Alliance getOpponent() { return Alliance.BLACK; }

    @Override
    public String toString() {
        return "Player Name: "
                + this.name
                + " Alliance: "
                + Alliance.WHITE.toString();
    }

}
