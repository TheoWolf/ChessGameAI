package org.chessgameai.board;

import org.chessgameai.Piece.*;

/**
 * Created by reda on 12/25/17.
 */
public final class Board {

    private static final Board STANDARD_BOARD = createInitialBoard();
    private final Tile[][] gameBoard;

    private Board(final Builder builder) {
        this.gameBoard = createGameBoard(builder);
    }

    private Tile[][] createGameBoard(Builder builder) {
        return builder.boardConfig;
    }

    public static Board createInitialBoard(){
        final Builder builder = new Builder();
        for (int i = 0; i < BoardUtils.NUM_TILES_PER_ROW; i++){
            for (int j = 0; j < BoardUtils.NUM_TILES_PER_COLUMN; j++){
                if(i == 0){
                    switch (j){
                        case 0:
                            builder.setTile(i, j, new Rook(Alliance.WHITE, new int[]{i,j}));
                            break;
                        case 1:
                            builder.setTile(i, j, new Knight(Alliance.WHITE, new int[]{i,j}));
                            break;
                        case 2:
                            builder.setTile(i, j, new Bishop(Alliance.WHITE, new int[]{i,j}));
                            break;
                        case 3:
                            builder.setTile(i, j, new Queen(Alliance.WHITE, new int[]{i,j}));
                            break;
                        case 4:
                            builder.setTile(i, j, new King(Alliance.WHITE, new int[]{i,j}));
                            break;
                        case 5:
                            builder.setTile(i, j, new Bishop(Alliance.WHITE, new int[]{i,j}));
                            break;
                        case 6:
                            builder.setTile(i, j, new Knight(Alliance.WHITE, new int[]{i,j}));
                            break;
                        case 7:
                            builder.setTile(i, j, new Rook(Alliance.WHITE, new int[]{i,j}));
                            break;
                    }
                }else if(i == 1){
                    //it is a Pawn
                    builder.setTile(i, j, new Pawn(Alliance.WHITE, new int[]{i,j}));
                }else if(i == 6){
                    //it is a Pawn
                    builder.setTile(i, j, new Pawn(Alliance.BLACK, new int[]{i,j}));
                }else if(i == 7){
                    switch (j){
                        case 0:
                            builder.setTile(i, j, new Rook(Alliance.BLACK, new int[]{i,j}));
                            break;
                        case 1:
                            builder.setTile(i, j, new Knight(Alliance.BLACK, new int[]{i,j}));
                            break;
                        case 2:
                            builder.setTile(i, j, new Bishop(Alliance.BLACK, new int[]{i,j}));
                            break;
                        case 3:
                            builder.setTile(i, j, new Queen(Alliance.BLACK, new int[]{i,j}));
                            break;
                        case 4:
                            builder.setTile(i, j, new King(Alliance.BLACK, new int[]{i,j}));
                            break;
                        case 5:
                            builder.setTile(i, j, new Bishop(Alliance.BLACK, new int[]{i,j}));
                            break;
                        case 6:
                            builder.setTile(i, j, new Knight(Alliance.BLACK, new int[]{i,j}));
                            break;
                        case 7:
                            builder.setTile(i, j, new Rook(Alliance.BLACK, new int[]{i,j}));
                            break;
                    }
                }else{
                    builder.setTile(i,j,null);
                }
            }
        }
        return builder.build();
    }

    public static Board createStandardBoard(){
        return STANDARD_BOARD;
    }

    @Override
    public String toString() {
        final StringBuilder text = new StringBuilder();
        for (int i = BoardUtils.NUM_TILES_PER_ROW-1; i >= 0 ; i--) {
            for (int j = BoardUtils.NUM_TILES_PER_COLUMN-1; j >= 0; j--) {
                text.append(String.format("%3s",this.gameBoard[i][j].toString()));
            }
            text.append("\n");
        }
        return text.toString();
    }

    public static class Builder {
        Tile[][] boardConfig;

        public Builder() {
            this.boardConfig = new Tile[BoardUtils.NUM_TILES_PER_ROW][BoardUtils.NUM_TILES_PER_COLUMN];
        }

        public Board build() { return new Board(this); }

        public Builder setTile(int x, int y, Piece piece) {
            this.boardConfig[x][y] = Tile.createTile(x,y,piece);
            return this;
        }
    }
}
