/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import model.Calculation;
import javafx.scene.control.Label;
import model.InvalidBeratException;
import model.InvalidTinggiException;

/**
 * FXML Controller class
 *
 * @author finde
 */
public class bmiAppController implements Initializable {

    @FXML
    private TextField tinggiField;
    @FXML
    private TextField beratField;
    @FXML
    private Label hasilLabel;
    @FXML
    private Label calcLabel;
    @FXML
    private Label indikatorLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void calculate() throws InvalidBeratException, InvalidTinggiException {
        
        try {
        float tinggi = Float.parseFloat(tinggiField.getText().trim());
        float berat = Float.parseFloat(beratField.getText().trim());
        
        Calculation cal = new Calculation (tinggi, berat);
        
        hasilLabel.setStyle("-fx-text-fill: #000000;");
        hasilLabel.setText("Hasil BMI Anda");
        calcLabel.setText(String.format("%.1f", cal.calculateBmi()));
        indikatorLabel.setText(cal.indikator(cal.calculateBmi()));
        }
        catch (InvalidTinggiException e){
            pesanError(e.getMessage());
        }
        catch (InvalidBeratException e){
            pesanError(e.getMessage());
        }
        catch (NumberFormatException e) {
            pesanError("Isi Harus Angka lebih dari 0");
        }
        
        
    }   
    private void pesanError(String pesan) {
        hasilLabel.setStyle("-fx-text-fill: #b91c1c;");
        hasilLabel.setText(pesan);
        calcLabel.setText("");
        indikatorLabel.setText("");
    }
}
