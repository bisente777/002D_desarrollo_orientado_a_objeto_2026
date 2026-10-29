package com.gamevault;

import com.gamevault.view.HomeScene;

import javafx.application.Application;
import javafx.stage.Stage;

public class GameVault extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new HomeScene().homeScene());
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
