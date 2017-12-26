package org.chessgameai.players;

import org.chessgameai.Piece.Piece;
import org.chessgameai.board.Alliance;

import java.util.Collection;

/**
 * Created by reda on 12/26/17.
 */
public final class WhitePlayer extends Player {
    public WhitePlayer(final String name,
                       final Collection<Piece> activePieces) {
        super(name,activePieces);
    }

    public WhitePlayer(final Collection<Piece> activePieces) {
        super("Player1",activePieces);
    }

    //need to ask the board about the white active pieces
    @Override
    public Collection<Piece> getActivePieces() {
        return null;
    }

    @Override
    public Alliance getAlliance() { return Alliance.WHITE; }
}
