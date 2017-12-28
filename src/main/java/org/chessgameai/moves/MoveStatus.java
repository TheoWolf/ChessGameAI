package org.chessgameai.moves;

/**
 * Created by TheoWolf on 12/28/17.
 */
public enum  MoveStatus {

    DONE {
        @Override
        public boolean isDone() { return true; }
    },
    IS_ILLEGAL_MOVE {
        @Override
        public boolean isDone() { return false; }
    };

    public abstract boolean isDone();
}
