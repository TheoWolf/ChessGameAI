package org.chessgameai.chessgameai;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.chessgameai.board.Board;

public class FXMLController implements Initializable {

    
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
