package com.company.Players;



public class SecondPlayerDistribution extends FirstPlayerDistribution {

    public final int[][] secondPlayerShips = new int[10][10];


    protected void makePositionsNullAgain(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                setShips[i][j] = 0;
            }

        }
    }
    protected void savingPositionsSecondPlayer(){
        for (int i = 0; i <10 ; i++) {
            System.arraycopy(setShips[i], 0, secondPlayerShips[i], 0, 10);
        }
    }

    protected void makeEveryThingNull(){
        makePositionsNullAgain();
        setCountAircraftCarrier(0);
        setCountBattleShip(0);
        setCountCruiser(0);
        setCountSubmarines(0);
    }
    protected void distributionForSecondPlayer(){
        setOneAircraftCarrier();
        setBattleShip();
        setCruiser();
        setSubmarines();
        savingPositionsSecondPlayer();
    }
}