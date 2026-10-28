/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author finde
 */
public class MainApp extends Application {
    
    @Override
    public void start(Stage stage) throws  Exception {
        
        FXMLLoader loads = new FXMLLoader (MainApp.class.getResource("/view/bmi-app.fxml"));
        
        Scene scene = new Scene(loads.load());
        
        stage.setTitle("Simple BMI Calculator");
        stage.setScene(scene);
        stage.setMinWidth(600);
        stage.setMinHeight(474);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
