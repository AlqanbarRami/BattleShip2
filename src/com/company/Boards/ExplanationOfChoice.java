package com.company.Boards;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ExplanationOfChoice extends DiceResult {

    public void explanationOfChoice() {
        //Save the second player name into our string variable
        firstPlayerName = "Server";
        secondPlayerName = "Client";
        //testing if we received it
        System.out.println(firstPlayerName + " ...........");
        System.out.println(secondPlayerName + " ...........");
        //Now we remove input field and our continue button
        mainPane.getChildren().removeAll(vBoxForAllItems, vBoxForInputAndButton);
        //Replace the Header with new text and attribute
        writeNote.setText("The player with the highest number of two dice. will start .. ");
        writeNote.setFont(Font.font("Arial", FontWeight.BOLD, 35));
        getNumbers.setPadding(new Insets(10, 30, 10, 30));
        mainPane.setCenter(getNumbers);
        getNumbers.setPadding(new Insets(10, 40, 10, 40));
        getNumbers.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        getNumbers.setCursor(Cursor.HAND);
        getNumbers.setOnAction(new EventHandler() {
            public void handle(Event event) {
                //Movie to result BorderPane
                showDiceResult();
            }
        });
    }
}
