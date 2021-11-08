package com.company.Hitting;

import com.company.Players.SecondPlayerDistribution;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;



public class ReadyForHitting extends SecondPlayerDistribution {
    public int firstPlayerHealth = 100;
    public int secondPlayerHealth = 100;
    private int typeOfShipFirstPlayer;
    private int typeOfShipSecondPlayer;

    public int getTypeOfShipFirstPlayer() {
        return typeOfShipFirstPlayer;
    }

    public void setTypeOfShipFirstPlayer(int typeOfShipFirstPlayer) {
        this.typeOfShipFirstPlayer = typeOfShipFirstPlayer;
    }

    public int getTypeOfShipSecondPlayer() {
        return typeOfShipSecondPlayer;
    }

    public void setTypeOfShipSecondPlayer(int typeOfShipSecondPlayer) {
        this.typeOfShipSecondPlayer = typeOfShipSecondPlayer;
    }

    protected void setShipsReadyForHittingFirstPlayer(Button button, int i, int j) {
        if (firstPlayerShips[i][j] == 2) {
            button.setStyle("-fx-background-color: #00ff00");
            button.setVisible(true);
            setTypeOfShipFirstPlayer(2);
            System.out.println(getTypeOfShipFirstPlayer());
            firstPlayerHealth = firstPlayerHealth - 2;
            System.out.println(firstPlayerHealth);

        }
        else if (firstPlayerShips[i][j] == 3) {
            button.setStyle("-fx-background-color: #000000");
            button.setVisible(true);
            setTypeOfShipFirstPlayer(3);
            System.out.println(getTypeOfShipFirstPlayer());
            firstPlayerHealth = firstPlayerHealth - 3;
            System.out.println(firstPlayerHealth);



        }
        else if (firstPlayerShips[i][j] == 4) {
            button.setStyle("-fx-background-color: #374710");
            button.setVisible(true);
            setTypeOfShipFirstPlayer(4);
            System.out.println(getTypeOfShipFirstPlayer());
            firstPlayerHealth = firstPlayerHealth - 4;
            System.out.println(firstPlayerHealth);


        }
        else if (firstPlayerShips[i][j] == 5) {
            button.setStyle("-fx-background-color: #9BA387");
            button.setVisible(true);
            setTypeOfShipFirstPlayer(5);
            System.out.println(getTypeOfShipFirstPlayer());
            firstPlayerHealth = firstPlayerHealth - 5;
            System.out.println(firstPlayerHealth);
        }

        else {
            setTypeOfShipFirstPlayer(0);
            System.out.println(firstPlayerHealth);
        }


    }
    protected void setShipsReadyForHittingSecondPlayer(Button button, int i, int j) {
        if (secondPlayerShips[i][j] == 2) {
            button.setStyle("-fx-background-color: #00ff00");
            button.setVisible(true);
            setTypeOfShipSecondPlayer(2);
            System.out.println(getTypeOfShipSecondPlayer());
            secondPlayerHealth = secondPlayerHealth - 2;
            System.out.println(secondPlayerHealth);



        }
        else if (secondPlayerShips[i][j] == 3) {
            button.setStyle("-fx-background-color: #000000");
            button.setVisible(true);
            setTypeOfShipSecondPlayer(3);
            System.out.println(getTypeOfShipSecondPlayer());
            secondPlayerHealth = secondPlayerHealth - 3;
            System.out.println(secondPlayerHealth);


        }
        else if (secondPlayerShips[i][j] == 4) {
            button.setStyle("-fx-background-color: #374710");
            button.setVisible(true);
            setTypeOfShipSecondPlayer(4);
            System.out.println(getTypeOfShipSecondPlayer());
            secondPlayerHealth = secondPlayerHealth - 4;
            System.out.println(secondPlayerHealth);


        }
        else if (secondPlayerShips[i][j] == 5) {
            button.setStyle("-fx-background-color: #9BA387");
            button.setVisible(true);
            setTypeOfShipSecondPlayer(5);
            System.out.println(getTypeOfShipSecondPlayer());
            secondPlayerHealth = secondPlayerHealth - 5;
            System.out.println(secondPlayerHealth);

        }
        else{
            setTypeOfShipSecondPlayer(0);
            System.out.println(secondPlayerHealth);

        }



    }

    /*
       public int firstPlayerHit(){
        int type = getTypeOfShipFirstPlayer();
        switch (type){
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                return 0;
        }
       }

        public int secondPlayerHit(){
            int type = getTypeOfShipSecondPlayer();
            switch (type){
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                default:
                    return 0;
            }
        }

     */
}
