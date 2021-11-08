package com.company.Players;

import com.company.Distribution.Submarines;

public class FirstPlayerDistribution extends Submarines {
    public final int[][] firstPlayerShips = new int[10][10];

    protected void savingPositionsFirstPlayer(){
        for (int i = 0; i <10 ; i++) {
            System.arraycopy(setShips[i], 0, firstPlayerShips[i], 0, 10);
        }
    }

    protected void distributionForFirstPlayer() {
        setOneAircraftCarrier();
        setBattleShip();
        setCruiser();
        setSubmarines();
        savingPositionsFirstPlayer();
    }

}
