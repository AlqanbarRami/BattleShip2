package com.company.PlacementOfShips;


import com.company.Boards.Items;
import com.company.Hitting.ReadyForHitting;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ExplanationOfShipColors extends ReadyForHitting {
    private VBox colorsExplain = new VBox(20);

    public VBox colorsDescription() {
        colorsExplain.setPrefWidth(255);
        Button aircraftCarrier = new Button("Aircraft Carrier");
        aircraftCarrier.setStyle("-fx-background-color: #9BA387");
        aircraftCarrier.setTextFill(Color.WHITE);
        aircraftCarrier.setPrefWidth(colorsExplain.getPrefWidth());
        aircraftCarrier.setPrefHeight(50);

        Button battleShip = new Button("Battle Ship");
        battleShip.setStyle("-fx-background-color: #374710");
        battleShip.setTextFill(Color.WHITE);
        battleShip.setPrefWidth(colorsExplain.getPrefWidth());
        battleShip.setPrefHeight(50);
        Button cruiser  = new Button("Cruiser");
        cruiser.setStyle("-fx-background-color: #000000");

        cruiser.setTextFill(Color.WHITE);
        cruiser.setPrefWidth(colorsExplain.getPrefWidth());
        cruiser.setPrefHeight(50);
        Button submarines = new Button("Submarines");
        submarines.setStyle("-fx-background-color: #00ff00");

        submarines.setTextFill(Color.WHITE);
        submarines.setPrefWidth(colorsExplain.getPrefWidth());
        submarines.setPrefHeight(50);
        colorsExplain.getChildren().addAll(aircraftCarrier,battleShip,cruiser,submarines);
        colorsExplain.setAlignment(Pos.CENTER);
        colorsExplain.setPadding(new Insets(0,0,0,50));
        return colorsExplain;
    }

}
