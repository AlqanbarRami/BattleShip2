package com.company.Boards;


import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.awt.datatransfer.Clipboard;

public class ServerBoard extends ClientBoard {


    public void serverBoard() {
        writeNote.setText("Please Enter Your Name");
        mainPane.getChildren().remove(vBoxForTwoButtons);
        vBoxForInputAndButton.setPrefWidth(250);
        inputFirstPlayerName.setPromptText("Enter your name ex:John");
        inputFirstPlayerName.setPadding(new Insets(10, 10, 10, 10));
        inputFirstPlayerName.setMaxWidth(vBoxForInputAndButton.getPrefWidth());
        buttonToSaveName.setPadding(new Insets(10, 40, 10, 40));
        buttonToSaveName.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        buttonToSaveName.setCursor(Cursor.HAND);
        vBoxForInputAndButton.setAlignment(Pos.CENTER);
        vBoxForInputAndButton.getChildren().addAll(inputFirstPlayerName, buttonToSaveName);
        mainPane.setCenter(vBoxForInputAndButton);
        buttonToSaveName.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                explanationOfChoice();
            }
        });

    }


}
