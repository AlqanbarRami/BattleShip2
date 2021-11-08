package com.company.Distribution;

import java.util.Random;

public class Submarines extends Cruiser{


    protected void setSubmarines() {
        while (getCountSubmarines() < 8) {
            Random randomRow = new Random();
            int row = randomRow.nextInt(9) + 1;
            Random randomColumn = new Random();
            int col = randomColumn.nextInt(9) + 1;
            if (setShips[row][col] == 0 && (col >= 1 && col <= 8)) {
                if (setShips[row][col + 1] == 0) {
                    setShips[row][col] = 2;
                    setShips[row][col + 1] = 2;
                    setCountSubmarines(getCountSubmarines() + 2);
                }
                else if (setShips[row][col - 1] == 0) {
                    setShips[row][col] = 2;
                    setShips[row][col - 1] = 2;
                    setCountSubmarines(getCountSubmarines() + 2);

                }


            }
            if (setShips[row][col] == 0 && (row >= 1 && row <= 8)) {
                if (setShips[row + 1][col] == 0) {
                    setShips[row][col] = 2;
                    setShips[row + 1][col] = 2;
                    setCountSubmarines(getCountSubmarines() + 2);
                }
                else if (setShips[row - 1][col] == 0) {
                    setShips[row][col] = 2;
                    setShips[row - 1][col] = 2;
                    setCountSubmarines(getCountSubmarines() + 2);
                }


            }
        }
    }
}
