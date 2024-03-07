package com.example.csd_214_lab_3_nawaz_cho;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("HR Management Nawaz");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();


    }


    public static double yearlysalry(double sal){
        double total=12*sal;
        return total;
    }
}


