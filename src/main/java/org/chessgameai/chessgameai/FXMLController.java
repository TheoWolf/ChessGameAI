package org.chessgameai.chessgameai;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.chessgameai.Piece.Bishop;
import org.chessgameai.Piece.Knight;
import org.chessgameai.Piece.Pawn;
import org.chessgameai.Piece.Rook;
import org.chessgameai.board.Alliance;
import org.chessgameai.board.Board;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Chess Board");
        Board chessBoard = Board.createStandardBoard();
        System.out.println(chessBoard.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
