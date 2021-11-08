package com.company.Boards;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class FirstBoardClientOrServer extends ServerBoard {

    public BorderPane firstBoardClientOrServer() {
        ImageView imageView = new ImageView();
        imageView.setImage(new Image("https://icon-library.com/images/battleship-icon/battleship-icon-12.jpg"));
        mainPane.setStyle("-fx-background-color: #53BFC9");
        mainPane.setPadding(new Insets(50, 0, 0, 0));
        writeNote.setText("Please choose one");
        writeNote.setFont(Font.font("Arial", FontWeight.BOLD, 45));
        hBoxForImage.getChildren().add(imageView);
        hBoxForImage.setAlignment(Pos.CENTER);
        hBoxForNote.getChildren().add(writeNote);
        hBoxForNote.setAlignment(Pos.CENTER);
        vBoxForTwoButtons.setPrefWidth(175);
        serverButton.setPadding(new Insets(10, 40, 10, 40));
        clientButton.setPadding(new Insets(10, 40, 10, 40));
        serverButton.setPrefWidth(vBoxForTwoButtons.getPrefWidth());
        serverButton.setCursor(Cursor.HAND);
        clientButton.setCursor(Cursor.HAND);
        clientButton.setPrefWidth(vBoxForTwoButtons.getPrefWidth());
        serverButton.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        clientButton.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        BorderPane.setMargin(vBoxForTwoButtons, new Insets(30, 0, 30, 0));
        vBoxForTwoButtons.getChildren().addAll(serverButton, clientButton);
        vBoxForTwoButtons.setAlignment(Pos.CENTER);
        mainPane.setTop(hBoxForNote);
        mainPane.setCenter(vBoxForTwoButtons);
        mainPane.setBottom(hBoxForImage);
        serverButton.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                serverBoard();

            }
        });

        clientButton.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                clientBoard();
            }
        });
        return mainPane;
    }


}
