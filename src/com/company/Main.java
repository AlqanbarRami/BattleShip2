package com.company;

import com.company.Boards.FightBoard;
import com.company.Boards.FirstBoardClientOrServer;
import com.company.Boards.Items;
import com.sun.glass.ui.Timer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
    long lastRefreshTime = 0;

    public static void main(String[] args) {
        launch(args);
        // write your code here
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Battleship");
        FirstBoardClientOrServer players = new FirstBoardClientOrServer();
        Scene scene = new Scene(players.firstBoardClientOrServer(), 1400, 750);
        primaryStage.setScene(scene);
        primaryStage.show();

        /*
        PaneOrganizer playerField = new PaneOrganizer();
        PaneOrganizer enemyField = new PaneOrganizer();
        BorderPane borderPane = new BorderPane();
        borderPane.getChildren().addAll(new Node[]{playerField.PaneOrganizer(), enemyField.PaneOrganizer()});
        borderPane.setLeft(playerField.PaneOrganizer());
        borderPane.setRight(enemyField.PaneOrganizer());
        Scene scene = new Scene(playerField.PaneOrganizer());
        primaryStage.setScene(scene);
        primaryStage.show();
         */

    }

}
