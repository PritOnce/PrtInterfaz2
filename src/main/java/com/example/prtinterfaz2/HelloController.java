package com.example.prtinterfaz2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button boton;
    @FXML
    private TextField t1;
    @FXML
    private TextField t2;
    @FXML
    private TextField t3;
    @FXML
    private RadioButton r1;
    @FXML
    private RadioButton r2;
    @FXML
    private RadioButton r3;
    @FXML
    private RadioButton r4;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void operaciones (ActionEvent event){
        try{
            int op1 = Integer.parseInt(this.t1.getText());
            int op2 = Integer.parseInt(this.t2.getText());
            Calcular calc = new Calcular(op1,op2);
            if(this.r1.isSelected()){
                int resultado=calc.sumar();
                this.t3.setText(resultado+"");
            } else if (this.r2.isSelected()) {
                double resultado=calc.dividir();
                this.t3.setText(resultado+"");
            } else if (this.r3.isSelected()) {
                int resultado= calc.restar();
                this.t3.setText(resultado+"");
            }else {
                int resultado= calc.multiplicar();
                this.t3.setText(resultado+"");
            }
        } catch (NumberFormatException e) {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato Incorrecto");
            alert.showAndWait();
        }
    }

}