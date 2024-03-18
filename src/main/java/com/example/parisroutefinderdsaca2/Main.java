package com.example.parisroutefinderdsaca2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public static Stage mainStage;
    public static Scene mainPage, secondPage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        mainStage = primaryStage; // Assign the primaryStage to the static mainStage variable

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("firstPage.fxml"));
        mainPage = new Scene(fxmlLoader.load(), 1600, 900);

        // Add stylesheet to the scene
        mainPage.getStylesheets().add(Objects.requireNonNull(getClass().getResource("stylesheet.css")).toExternalForm());
        mainStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("icon.png"))));
        mainStage.setTitle("PARIS CITY ROUTE FINDER");
        mainStage.setScene(mainPage);
        mainStage.show();
    }


    public static void switchToSecondScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("dashboard.fxml"));
        secondPage = new Scene(fxmlLoader.load(), 1600, 900);
        secondPage.getStylesheets().add(Objects.requireNonNull(Main.class.getResource("stylesheet.css")).toExternalForm());

        mainStage.setScene(secondPage);
    }



    public static void main(String[] args) {
        launch();
    }
}