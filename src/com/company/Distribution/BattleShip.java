package com.company.Distribution;

import java.util.Random;

public class BattleShip extends AircraftCarrier {


    public void setBattleShip() {
        while (getCountBattleShip() < 8){
            Random randomRow = new Random();
            int row = randomRow.nextInt(8) + 1;
            Random randomColumn = new Random();
            int col = randomColumn.nextInt(8) + 1;
            if (setShips[row][col] == 0 && (col >= 3 && col <= 6)) {
                if (setShips[row][col + 1] == 0 && setShips[row][col + 2] == 0 && setShips[row][col + 3] == 0) {
                    setShips[row][col] = 4;
                    setShips[row][col + 1] = 4;
                    setShips[row][col + 2] = 4;
                    setShips[row][col + 3] = 4;
                    setCountBattleShip(getCountBattleShip() + 4);
                }
                else if (setShips[row][col - 1] == 0 && setShips[row][col - 2] == 0 && setShips[row][col - 3] == 0) {
                    setShips[row][col] = 4;
                    setShips[row][col - 1] = 4;
                    setShips[row][col - 2] = 4;
                    setShips[row][col - 3] = 4;
                    setCountBattleShip(getCountBattleShip() + 4);
                }

            }
            if (setShips[row][col] == 0 && (row >= 3 && row <= 6)) {
                if (setShips[row + 1][col] == 0 && setShips[row + 2][col] == 0 && setShips[row + 3][col] == 0) {
                    setShips[row][col] = 4;
                    setShips[row + 1][col] = 4;
                    setShips[row + 2][col] = 4;
                    setShips[row + 3][col] = 4;
                    setCountBattleShip(getCountBattleShip() + 4);

                }
                else if (setShips[row - 1][col] == 0 && setShips[row - 2][col] == 0 && setShips[row - 3][col] == 0) {
                    setShips[row][col] = 4;
                    setShips[row - 1][col] = 4;
                    setShips[row - 2][col] = 4;
                    setShips[row - 3][col] = 4;
                    setCountBattleShip(getCountBattleShip() + 4);
                }
            }
        }
    }
}
