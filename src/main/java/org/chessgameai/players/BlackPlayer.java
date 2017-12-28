package org.chessgameai.players;

import org.chessgameai.Piece.Piece;
import org.chessgameai.board.Alliance;
import org.chessgameai.board.Board;

import java.util.Collection;

/**
 * Created by TheoWolf on 12/26/17.
 */
public final class BlackPlayer extends Player {
    public BlackPlayer(final Board board,
                       final String name,
                       final Collection<Piece> activePieces) {
        super(board, name, activePieces);
    }

    public BlackPlayer(final Board board,
                       final Collection<Piece> activePieces) {
        super(board, "Player2", activePieces);
    }

    @Override
    public Collection<Piece> getActivePieces() {
        return this.board.getBlackActivePieces();
    }

    @Override
    public Alliance getAlliance() { return Alliance.BLACK; }


}