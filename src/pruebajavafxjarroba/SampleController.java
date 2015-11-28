/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajavafxjarroba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Richard
 */
public class SampleController implements Initializable {
    
    @FXML private TextField tfNombre;
    @FXML private TextField tfApellido;
    @FXML private TextField tfDatos;
    @FXML private ChoiceBox chAnio;
    
   
    @FXML private void accionMostrar (ActionEvent evento){
        String nombre = tfNombre.getText();
        String apellido = tfApellido.getText();
        String anio = chAnio.getValue().toString();
        tfDatos.setText("Nombre: "+nombre+" Apellido: "+apellido+" Año Nacimiento: "+anio);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfNombre.setText("---");
    }    
}
