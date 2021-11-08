package com.company.Boards;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ClientBoard extends ExplanationOfChoice {


    public void clientBoard() {
        mainPane.getChildren().removeAll(vBoxForTwoButtons);
        writeNote.setText("Enter Your Name, ip and port To connect");
        inputNameAndLabel.getChildren().addAll(yourName, inputSecondPlayerName);
        inputSecondPlayerName.setPromptText("Enter Name ex : John");
        yourName.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        inputNameAndLabel.setAlignment(Pos.TOP_CENTER);
        inputIpAndLabel.getChildren().addAll(Ip, inputIp);
        inputIp.setPromptText("ex : 127.0.0.1");
        Ip.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        inputIpAndLabel.setAlignment(Pos.CENTER);
        inputPortAndLabel.getChildren().addAll(port, inputPort);
        inputPort.setPromptText("ex : 5000");
        port.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        inputPortAndLabel.setAlignment(Pos.BOTTOM_CENTER);
        buttonToSaveName.setPadding(new Insets(10, 40, 10, 40));
        buttonToSaveName.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        buttonToSaveName.setCursor(Cursor.HAND);
        forButton.getChildren().add(buttonToSaveName);
        forButton.setMaxWidth(250);
        forButton.setAlignment(Pos.CENTER_RIGHT);
        vBoxForAllItems.getChildren().addAll(inputNameAndLabel, inputIpAndLabel, inputPortAndLabel, forButton);
        vBoxForAllItems.setAlignment(Pos.CENTER);
        VBox.setMargin(inputNameAndLabel, new Insets(30, 0, 0, 0));
        mainPane.setCenter(vBoxForAllItems);
        buttonToSaveName.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                explanationOfChoice();
            }
        });

    }
}
