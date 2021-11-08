package com.company.Boards;

import com.company.PlacementOfShips.FirstAndSecondShipsPositions;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Items extends FirstAndSecondShipsPositions {

    //** Items FirstBoardClientORServer **//
    public BorderPane mainPane = new BorderPane();
    public Label writeNote = new Label();
    public HBox hBoxForNote = new HBox();
    public HBox hBoxForImage = new HBox(5);
    public VBox vBoxForTwoButtons = new VBox(20);
    public Button serverButton = new Button("Server");
    public Button clientButton = new Button("Client");

    //** Items ServerBoard **//
    public TextField inputFirstPlayerName = new TextField();
    public Button buttonToSaveName = new Button("Continue");
    public VBox vBoxForInputAndButton = new VBox(25);

    // ** Items ClientBoard **//
    public TextField inputSecondPlayerName = new TextField();
    public Label yourName = new Label("Name : ");
    public TextField inputIp = new TextField();
    public Label Ip = new Label("Ip      : ");
    public TextField inputPort = new TextField();
    public Label port = new Label("Port  : ");
    public HBox inputNameAndLabel = new HBox(10);
    public HBox inputIpAndLabel = new HBox(10);
    public HBox inputPortAndLabel = new HBox(10);
    public HBox forButton = new HBox(10);
    public VBox vBoxForAllItems = new VBox(20);

    //** Items ExplanationOfChoice **//
    public String firstPlayerName;
    public String secondPlayerName;
    public Button getNumbers = new Button("Ok Let's See");


    //** Items DiceResult ** //
    public Label diceResultFirstPlayer = new Label();
    public Label diceResultSecondPlayer = new Label();
    public Button gotToFightBoard = new Button("Start Fight");
    public Label diceResultLabel = new Label();
    public VBox vBoxForDiceResult = new VBox(50);

    //** Items FightBoard **//
    public int firstPlayerHealth = 100;
    public int secondPlayerHealth = 100;
    public BorderPane fightPane = new BorderPane();
    public Label firstPlayerLabel = new Label();
    public Label secondPlayerLabel = new Label();
    public HBox hBoxFirstPlayer = new HBox();
    public HBox hBoxSecondPlayer = new HBox();
    public HBox firstPlayerPositionsNumbers = new HBox();
    public HBox secondPlayerPositionsNumbers = new HBox();
    public BorderPane paneToTakeNamesAndHealths = new BorderPane();
    public VBox firstPlayerPositionsAlphabet = new VBox();
    public VBox secondPlayerPositionsAlphabet = new VBox();


}
