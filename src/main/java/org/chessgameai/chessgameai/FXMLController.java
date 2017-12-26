package org.chessgameai.chessgameai;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.chessgameai.Piece.Pawn;
import org.chessgameai.board.Alliance;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Pawn pawn = new Pawn(Alliance.BLACK,new int[]{1,1});
        System.out.println(pawn.toString());
    }    
}
