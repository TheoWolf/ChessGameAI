package org.chessgameai.players;

import org.chessgameai.Piece.Piece;
import org.chessgameai.board.Alliance;

import java.util.Collection;

/**
 * Created by reda on 12/26/17.
 */
public final class BlackPlayer extends Player {
    public BlackPlayer(final String name,
                       final Collection<Piece> activePieces) {
        super(name,activePieces);
    }

    public BlackPlayer(final Collection<Piece> activePieces) {
        super("Player2",activePieces);
    }


    //need to ask the board about the black active pieces
    @Override
    public Collection<Piece> getActivePieces() {
        return null;
    }

    @Override
    public Alliance getAlliance() { return Alliance.BLACK; }

}