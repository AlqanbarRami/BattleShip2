package com.company.Distribution;

import java.util.Random;

public class Cruiser extends BattleShip{

    protected void setCruiser(){
        while (getCountCruiser() < 9) {
            Random randomRow = new Random();
            int row = randomRow.nextInt(8) + 1;
            Random randomColumn = new Random();
            int col = randomColumn.nextInt(8) + 1;
            if (setShips[row][col] == 0 && (col >= 2 && col <= 7)) {
                if (setShips[row][col + 1] == 0 && setShips[row][col + 2] == 0) {
                    setShips[row][col] = 3;
                    setShips[row][col + 1] = 3;
                    setShips[row][col + 2] = 3;
                    setCountCruiser(getCountCruiser() + 3);
                }
                else if (setShips[row][col - 1] == 0 && setShips[row][col - 2] == 0) {
                    setShips[row][col] = 3;
                    setShips[row][col - 1] = 3;
                    setShips[row][col - 2] = 3;
                    setCountCruiser(getCountCruiser() + 3);
                }
            }
            if (setShips[row][col] == 0 && (row >= 2 && row <= 7)) {
                if (setShips[row + 1][col] == 0 && setShips[row + 2][col] == 0) {
                    setShips[row][col] = 3;
                    setShips[row + 1][col] = 3;
                    setShips[row + 2][col] = 3;
                    setCountCruiser(getCountCruiser() + 3);

                }
                else if (setShips[row - 1][col] == 0 && setShips[row - 2][col] == 0) {
                    setShips[row][col] = 3;
                    setShips[row - 1][col] = 3;
                    setShips[row - 2][col] = 3;
                    setCountCruiser(getCountCruiser() + 3);

                }

            }
        }

    }
}
