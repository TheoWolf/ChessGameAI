package org.chessgameai.board;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Table;
import org.chessgameai.Alliance;
import org.chessgameai.Piece.*;
import org.chessgameai.pieces.*;
import org.chessgameai.players.BlackPlayer;
import org.chessgameai.players.Player;
import org.chessgameai.players.WhitePlayer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by TheoWolf on 12/25/17.
 */
public final class Board {

    private static final Board STANDARD_BOARD = createInitialBoard();
    private final Table<Integer,Integer,Tile> gameBoard;
    private final Collection<Piece> whiteActivePieces;
    private final Collection<Piece> blackActivePieces;
    private final WhitePlayer whitePlayer;
    private final BlackPlayer blackPlayer;
    private final Player currentPlayer;

    private Board(final Builder builder) {
        this.gameBoard = createGameBoard(builder);
        this.whiteActivePieces = calculateActivePieces(builder, Alliance.WHITE);
        this.blackActivePieces = calculateActivePieces(builder,Alliance.BLACK);
        this.whitePlayer = new WhitePlayer(this, "WHITE", whiteActivePieces);
        this.blackPlayer = new BlackPlayer(this, "BLACK", blackActivePieces);
        this.currentPlayer = builder.turnToPlay.getPlayerByAlliance(this.whitePlayer, this.blackPlayer);
    }

    private Table<Integer, Integer, Tile> createGameBoard(Builder builder) {
        return builder.boardConfig;
    }

    public Table<Integer, Integer, Tile> getGameBoard() { return gameBoard; }

    public WhitePlayer WhitePlayer() { return whitePlayer; }

    public BlackPlayer BlackPlayer() { return blackPlayer; }

    public Player currentPlayer() { return currentPlayer; }

    public Collection<Piece> getWhiteActivePieces() { return whiteActivePieces; }

    public Collection<Piece> getBlackActivePieces() { return blackActivePieces; }

    public Iterable<Piece> getAllActivePieces(){
        return Iterables.unmodifiableIterable(Iterables.concat(this.whiteActivePieces,this.blackActivePieces));
    }

    public static Board createStandardBoard(){
        return STANDARD_BOARD;
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
        builder.setTurnToPlay(Alliance.WHITE);
        return builder.build();
    }

    private Collection<Piece> calculateActivePieces(Builder builder,
                                                    Alliance alliance) {
        List<Piece> pieceList =  new ArrayList<>();
        for (int i = 0; i < BoardUtils.NUM_TILES_PER_ROW; i++) {
            for (int j = 0; j < BoardUtils.NUM_TILES_PER_COLUMN; j++) {
                if(builder.boardConfig.get(i,j).isTileOccupied()){
                    if(builder.boardConfig.get(i,j).getPiece().getPieceAllegiance() == alliance) {
                        pieceList.add(builder.boardConfig.get(i, j).getPiece());
                    }
                }
            }
        }
        return pieceList;
    }

    @Override
    public String toString() {
        final StringBuilder text = new StringBuilder();
        for (int i = BoardUtils.NUM_TILES_PER_ROW-1; i >= 0 ; i--) {
            for (int j = BoardUtils.NUM_TILES_PER_COLUMN-1; j >= 0; j--) {
                text.append(String.format("%3s",this.gameBoard.get(i,j).toString()));
            }
            text.append("\n");
        }
        return text.toString();
    }

    public static class Builder {
        Table<Integer,Integer,Tile> boardConfig;
        Alliance turnToPlay;

        public Builder() {
            this.boardConfig = HashBasedTable.create(BoardUtils.NUM_TILES_PER_ROW,BoardUtils.NUM_TILES_PER_COLUMN);
        }

        public Board build() { return new Board(this); }

        public Builder setTurnToPlay(final Alliance turnToPlay){
            this.turnToPlay = turnToPlay;
            return this;
        }

        public Builder setTile(final int x, final int y, final Piece piece) {
            this.boardConfig.put(x, y, Tile.createTile(x,y,piece));
            return this;
        }
    }
}
