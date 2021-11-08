package com.company.Boards;


import com.company.PlacementOfShips.FirstAndSecondShipsPositions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class FightBoard extends Items {


    //* FirstPlayer And SecondPlayer Numbers *//
    public void numbersOverShips() {
        for (int i = 1; i < 11; i++) {
            Label firstPlayerNumbers = new Label();
            firstPlayerNumbers.setText(String.valueOf(i));
            HBox.setMargin(firstPlayerNumbers, new Insets(5, 0, 5, 40));
            firstPlayerPositionsNumbers.getChildren().add(firstPlayerNumbers);
            firstPlayerNumbers.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        }
        for (int i = 1; i < 11; i++) {
            Label secondPlayerNumbers = new Label();
            secondPlayerNumbers.setText(String.valueOf(i));
            HBox.setMargin(secondPlayerNumbers, new Insets(5, 0, 5, 40));
            secondPlayerPositionsNumbers.getChildren().add((secondPlayerNumbers));
            secondPlayerNumbers.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        }
        firstPlayerPane.setTop(firstPlayerPositionsNumbers);
        secondPlayerPane.setTop(secondPlayerPositionsNumbers);
        BorderPane.setMargin(secondPlayerPositionsNumbers, new Insets(50, 0, 0, 40));
        BorderPane.setMargin(firstPlayerPositionsNumbers, new Insets(50, 0, 0, 20));
    }

    public void alphabetsLeftToShips() {

        for (char i = 'A'; i < 'K'; i++) {
            Label firstPlayerAlphabet = new Label();
            firstPlayerAlphabet.setText(String.valueOf(i));
            firstPlayerPositionsAlphabet.getChildren().add((firstPlayerAlphabet));
            VBox.setMargin(firstPlayerAlphabet, new Insets(10, 10, 23, 0));
            firstPlayerAlphabet.setFont(Font.font("Arial", FontWeight.BOLD, 15));

        }
        for (char i = 'A'; i < 'K'; i++) {
            Label secondPlayerAlphabet = new Label();
            secondPlayerAlphabet.setText(String.valueOf(i));
            VBox.setMargin(secondPlayerAlphabet, new Insets(10, 10, 23, 0));
            secondPlayerPositionsAlphabet.getChildren().add((secondPlayerAlphabet));
            secondPlayerAlphabet.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        }
        firstPlayerPane.setLeft(firstPlayerPositionsAlphabet);
        BorderPane.setMargin(firstPlayerPositionsAlphabet, new Insets(5, 0, 0, 20));
        secondPlayerPane.setLeft(secondPlayerPositionsAlphabet);
        BorderPane.setMargin(secondPlayerPositionsAlphabet, new Insets(5, 0, 0, 40));
    }


    public void avoidRepeatNumbersAndAlphabets() {
        firstPlayerPane.getChildren().remove(firstPlayerPositionsNumbers);
        secondPlayerPane.getChildren().remove(secondPlayerPositionsNumbers);
        firstPlayerPane.getChildren().remove(firstPlayerPositionsAlphabet);
        secondPlayerPane.getChildren().remove(secondPlayerPositionsAlphabet);
    }


    public void fightBoard() {
        //secondPlayerHealth = secondPlayerHealth - secondPlayerHit();
        mainPane.getChildren().removeAll(vBoxForDiceResult, hBoxForImage);
        firstPlayerLabel.setText(firstPlayerName + "s" + " Health is " + ":     " + firstPlayerHealth + " %");
        firstPlayerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        secondPlayerLabel.setText(secondPlayerName + "s " + "Health is " + ":     " + secondPlayerHealth + "%");
        secondPlayerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        firstPlayerLabel.setAlignment(Pos.CENTER);
        secondPlayerLabel.setAlignment(Pos.CENTER);
        System.out.println(firstPlayerHealth);
        System.out.println(secondPlayerHealth);
        numbersOverShips();
        alphabetsLeftToShips();
        hBoxFirstPlayer.getChildren().add(firstPlayerLabel);
        hBoxSecondPlayer.getChildren().add(secondPlayerLabel);
        hBoxFirstPlayer.setBackground(new Background(new BackgroundFill(Color.BEIGE, CornerRadii.EMPTY, Insets.EMPTY)));
        hBoxFirstPlayer.setPrefWidth(550);
        hBoxFirstPlayer.setPrefHeight(100);
        hBoxFirstPlayer.setAlignment(Pos.CENTER);
        hBoxSecondPlayer.setBackground(new Background(new BackgroundFill(Color.BEIGE, CornerRadii.EMPTY, Insets.EMPTY)));
        hBoxSecondPlayer.setPrefWidth(550);
        hBoxSecondPlayer.setPrefHeight(100);
        hBoxSecondPlayer.setAlignment(Pos.CENTER);
        paneToTakeNamesAndHealths.setLeft(hBoxFirstPlayer);
        paneToTakeNamesAndHealths.setRight(hBoxSecondPlayer);
        mainPane.setStyle("-fx-background-color: #53BFC9");
        firstPlayerPane.setCenter(firstPlayerButtons());
        secondPlayerPane.setCenter(secondPlayerButtons());
        secondPlayerPane.setPadding(new Insets(0, 40, 0, 0));
        fightPane.setTop(paneToTakeNamesAndHealths);
        fightPane.setLeft(firstPlayerPane);
        fightPane.setRight(secondPlayerPane);
        fightPane.setCenter(colorsDescription());
        mainPane.setPadding(new Insets(0, 0, 0, 0));
        mainPane.setTop(fightPane);

    }

    /*
    public void count() {
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.seconds(1.0), e -> {
                        firstPlayerLabel.setText(String.valueOf(firstPlayerHealth - 1));
                        System.out.println(firstPlayerHealth - 1);
                    })
            );
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
        }

     */



}