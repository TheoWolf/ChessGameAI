package org.chessgameai.Piece;

import org.chessgameai.board.Alliance;

/**
 * Created by reda on 12/25/17.
 */
public abstract class Piece {

    private Alliance pieceAlliance;

    public Alliance getPieceAllegiance() {
        return this.pieceAlliance;
    }
}
