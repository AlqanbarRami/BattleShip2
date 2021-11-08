package com.company.PlacementOfShips;


import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class FirstAndSecondShipsPositions extends ExplanationOfShipColors  {
    public Button[][] buttonsFirstPlayer = new Button[10][10] ;
    public Button[][] buttonsSecondPlayer = new Button[10][10] ;
    public GridPane buttonsPaneSecondPlayer = new GridPane();
    public GridPane buttonsPaneFirstPlayer = new GridPane();
    public BorderPane firstPlayerPane = new BorderPane();
    public BorderPane secondPlayerPane = new BorderPane();


    public GridPane firstPlayerButtons() {
        distributionForFirstPlayer();
        buttonsPaneFirstPlayer.setStyle("-fx-background-color: #53BFC9");
        for (int i = 0; i < 10; i++) {
            buttonsPaneFirstPlayer.getColumnConstraints().add(new ColumnConstraints(50));
            buttonsPaneFirstPlayer.getRowConstraints().add(new RowConstraints(50));
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                buttonsFirstPlayer[i][j] = new Button();
                buttonsFirstPlayer[i][j].setPrefHeight(50);
                buttonsFirstPlayer[i][j].setPrefWidth(50);
                GridPane.setConstraints(buttonsFirstPlayer[i][j], i, j);
                buttonsPaneFirstPlayer.getChildren().add(buttonsFirstPlayer[i][j]);

            }

        }
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
                int finalI = i;
                int finalJ = j;
                buttonsFirstPlayer[i][j].setCursor(Cursor.HAND);
                buttonsFirstPlayer[i][j].setOnAction(new EventHandler() {
                    @Override
                    public void handle(Event event) {
                        buttonsFirstPlayer[finalI][finalJ].setVisible(false);
                        setShipsReadyForHittingFirstPlayer(buttonsFirstPlayer[finalI][finalJ], finalJ, finalI);
                        firstPlayerPane.setDisable(true);
                        secondPlayerPane.setDisable(false);


                    }
                });


            }
        }
        //Check
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10; j++) {
                System.out.print(firstPlayerShips[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("first Complete");

        return buttonsPaneFirstPlayer;
    }



    public GridPane secondPlayerButtons() {
        makeEveryThingNull();
        distributionForSecondPlayer();
        buttonsPaneSecondPlayer.setStyle("-fx-background-color: #53BFC9");
        for (int i = 0; i < 10; i++) {
            buttonsPaneSecondPlayer.getColumnConstraints().add(new ColumnConstraints(50));
            buttonsPaneSecondPlayer.getRowConstraints().add(new RowConstraints(50));
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                buttonsSecondPlayer[i][j] = new Button();
                buttonsSecondPlayer[i][j].setPrefHeight(50);
                buttonsSecondPlayer[i][j].setPrefWidth(50);
                GridPane.setConstraints(buttonsSecondPlayer[i][j],i, j);
                buttonsPaneSecondPlayer.getChildren().add(buttonsSecondPlayer[i][j]);
            }
        }
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
                int finalI = i;
                int finalJ = j;
                buttonsSecondPlayer[i][j].setCursor(Cursor.HAND);
                buttonsSecondPlayer[i][j].setOnAction(new EventHandler() {
                    @Override
                    public void handle(Event event) {
                        buttonsSecondPlayer[finalI][finalJ].setVisible(false);
                        setShipsReadyForHittingSecondPlayer(buttonsSecondPlayer[finalI][finalJ], finalJ, finalI);
                        secondPlayerPane.setDisable(true);
                        firstPlayerPane.setDisable(false);



                    }
                });


            }
        }


        //*Just checking
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10; j++) {
                System.out.print(secondPlayerShips[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Complete");
        //*

        return buttonsPaneSecondPlayer;
    }



}
