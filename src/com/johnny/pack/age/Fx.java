package com.johnny.pack.age;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import java.io.File;

public class Fx extends Application {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    private Stage stage;
    private Label lblFileName;
    private Label lblFilePath;

    @Override
    public void start(Stage primaryStage){

        stage = primaryStage;

        Label lblGreet = new Label();
        lblGreet.setText("Hello, choose a file!");


        HBox paneGreet = new HBox(lblGreet);
        paneGreet.setPadding(new Insets(10, 10, 10, 10));

        Button btnOk = new Button("OK");
        btnOk.setPrefWidth(80);
        btnOk.setOnAction(e -> btnOk_Click());
        
        Button btnNo = new Button("No");
        btnNo.setPrefWidth(80);
        btnNo.setOnAction(e -> btnNo_Click());

        HBox paneButton = new HBox(10, btnOk, btnNo);
        paneButton.setPadding(new Insets(10,10,10,10));

        lblFileName = new Label();
        lblFileName.setText("You have not selected a file");
        HBox paneFileName = new HBox();
        paneFileName.setPadding(new Insets(10, 10, 10, 10));
        paneFileName.getChildren().add(lblFileName);

        lblFilePath = new Label();
        HBox paneFilePath = new HBox();
        paneFilePath.setPadding(new Insets(10, 10, 10, 10));
        paneFilePath.getChildren().add(lblFilePath);

        VBox paneMain = new VBox();
        paneMain.setPrefHeight(300);
        paneMain.setPrefWidth(400);
        paneMain.getChildren().addAll(paneGreet, paneButton, paneFileName, paneFilePath);

        Scene scene = new Scene(paneMain);

        stage.setScene(scene);
        stage.setTitle("File Chooser with JavaFX");
        stage.show();
    }

    private void btnNo_Click() {
        stage.close();
    }

    private void btnOk_Click() {
        FileChooser fChooser = new FileChooser();
        File selectedFile = fChooser.selectFile();
        lblFileName.setText("File: " + selectedFile.getName());
        lblFilePath.setText("From: " + selectedFile.getAbsolutePath());
    }
}
