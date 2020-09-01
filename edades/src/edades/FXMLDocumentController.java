/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edades;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Daniel
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField nombre;
    @FXML
    private TextField DiaN;        
    @FXML
    private TextField MesN;
    @FXML
    private TextField AñoN;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Operacion hecha con exito");
        label.setText("gracias por usar nuestro sistema");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
