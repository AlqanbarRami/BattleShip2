package com.company.Boards;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.Random;

public class DiceResult extends PlayersManagement {

    public boolean avoidTie = true;
    public int diceNumberFirstPlayer;
    public int diceNumberSecondPlayer;

    public int getRandomsNumber() {
        Random random = new Random();
        return random.nextInt(12) + 1;
    }

    public void noTie() {
        while (avoidTie) {
            // getting numbers for players from our function
            int number1 = getRandomsNumber();
            int number2 = getRandomsNumber();
            if (number1 != number2) {
                avoidTie = false;
                diceNumberFirstPlayer = number1;
                diceNumberSecondPlayer = number2;
            }
        }
    }


    public void showDiceResult() {
        noTie();
        mainPane.getChildren().remove(hBoxForNote);
        // setting som new attributes
        diceResultFirstPlayer.setText("The First Player " + firstPlayerName.toUpperCase() + " : " + " Got " + diceNumberFirstPlayer);
        diceResultFirstPlayer.setFont(Font.font("Arial", FontWeight.BOLD, 32));
        diceResultSecondPlayer.setText("The Second Player " + secondPlayerName.toUpperCase() + " : " + " Got " + diceNumberSecondPlayer);
        diceResultSecondPlayer.setFont(Font.font("Arial", FontWeight.BOLD, 32));
        gotToFightBoard.setPadding(new Insets(10, 30, 10, 30));
        diceResultLabel.setFont(Font.font("Arial", FontWeight.BOLD, 40));
        chooseWhoStartsFirst(diceNumberFirstPlayer, diceNumberSecondPlayer);
        vBoxForDiceResult.getChildren().addAll(diceResultFirstPlayer, diceResultSecondPlayer, diceResultLabel, gotToFightBoard);
        vBoxForDiceResult.setAlignment(Pos.BASELINE_CENTER);
        mainPane.setCenter(vBoxForDiceResult);
        // select the player from our function
        gotToFightBoard.setOnAction(new EventHandler() {
            public void handle(Event event) {
                int number = chooseWhoStartsFirst(diceNumberFirstPlayer, diceNumberSecondPlayer);
                shootEachOther(number);

            }
        });
    }

}
