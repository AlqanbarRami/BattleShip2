package com.company.Distribution;


import com.company.Boards.Items;
import com.company.Hitting.ReadyForHitting;

import java.util.Random;

public class AircraftCarrier  {
    public int[][] setShips = new int[10][10];
    private int countAircraftCarrier;
    private int countCruiser;
    private int countSubmarines;
    private int countBattleShip;


    public int getCountBattleShip() {
        return countBattleShip;
    }

    public void setCountBattleShip(int countBattleShip) {
        this.countBattleShip = countBattleShip;
    }

    public int getCountSubmarines() {
        return countSubmarines;
    }

    public void setCountSubmarines(int countSubmarines) {
        this.countSubmarines = countSubmarines;
    }

    public int getCountCruiser() {
        return countCruiser;
    }

    public void setCountCruiser(int countCruiser) {
        this.countCruiser = countCruiser;
    }

    protected int getCountAircraftCarrier() {
        return countAircraftCarrier;
    }

    protected void setCountAircraftCarrier(int countAircraftCarrier) {
        this.countAircraftCarrier = countAircraftCarrier;
    }



    protected void aircraftCarrierHorizontal() {
        if(getCountAircraftCarrier() < 5) {
            Random randomPosition = new Random();
            int randomRow = randomPosition.nextInt(10);
            int randomColumn = randomPosition.nextInt(10);
            //if Column is Zero so go right!
            if (randomColumn == 0) {
                if (setShips[randomRow][randomColumn] == 0) {
                    if (setShips[randomRow][randomColumn + 2] == 0 && setShips[randomRow][randomColumn + 4] == 0 &&
                            setShips[randomRow][randomColumn + 6] == 0 && setShips[randomRow][randomColumn + 8] == 0) {
                        setShips[randomRow][randomColumn] = 5;
                        setShips[randomRow][randomColumn + 2] = 5;
                        setShips[randomRow][randomColumn + 4] = 5;
                        setShips[randomRow][randomColumn + 6] = 5;
                        setShips[randomRow][randomColumn + 8] = 5;
                        setCountAircraftCarrier(5);
                    }

                }
            }
            //if Column is Zero so go left!
            else if (randomColumn == 9) {
                if (setShips[randomRow][randomColumn] == 0) {
                    if (setShips[randomRow][randomColumn - 2] == 0 && setShips[randomRow][randomColumn - 4] == 0 &&
                            setShips[randomRow][randomColumn - 6] == 0 && setShips[randomRow][randomColumn - 8] == 0) {
                        setShips[randomRow][randomColumn] = 5;
                        setShips[randomRow][randomColumn - 2] = 5;
                        setShips[randomRow][randomColumn - 4] = 5;
                        setShips[randomRow][randomColumn - 6] = 5;
                        setShips[randomRow][randomColumn - 8] = 5;
                        setCountAircraftCarrier(5);
                    }
                }

            }
        }

    }
    protected void aircraftCarrierVertical() {
        if(getCountAircraftCarrier() <5) {
            Random randomPosition = new Random();
            int randomRow = randomPosition.nextInt(10);
            int randomColumn = randomPosition.nextInt(10);
            //if Row less or equal 1 go down
            if (randomRow <= 1) {
                if (setShips[randomRow][randomColumn] == 0) {
                    if (setShips[randomRow + 2][randomColumn] == 0 && setShips[randomRow + 4][randomColumn] == 0 &&
                            setShips[randomRow + 6][randomColumn] == 0 && setShips[randomRow + 8][randomColumn] == 0) {
                        setShips[randomRow][randomColumn] = 5;
                        setShips[randomRow + 2][randomColumn] = 5;
                        setShips[randomRow + 4][randomColumn] = 5;
                        setShips[randomRow + 6][randomColumn] = 5;
                        setShips[randomRow + 8][randomColumn] = 5;
                        setCountAircraftCarrier(5);
                    }
                }
            }
            //if Row bigger than or equal 8 go up
            else if (randomRow >= 8) {
                if (setShips[randomRow][randomColumn] == 0) {
                    if (setShips[randomRow - 2][randomColumn] == 0 && setShips[randomRow - 4][randomColumn] == 0 &&
                            setShips[randomRow - 6][randomColumn] == 0 && setShips[randomRow - 8][randomColumn] == 0) {
                        setShips[randomRow][randomColumn] = 5;
                        setShips[randomRow - 2][randomColumn] = 5;
                        setShips[randomRow - 4][randomColumn] = 5;
                        setShips[randomRow - 6][randomColumn] = 5;
                        setShips[randomRow - 8][randomColumn] = 5;
                        setCountAircraftCarrier(5);
                    }
                }
            }
        }
    }

    protected void upRightToLeftDownAndReverse() {
        if(getCountAircraftCarrier() < 5) {
            Random randomPosition = new Random();
            int randomRow = randomPosition.nextInt(10);
            int randomColumn = randomPosition.nextInt(10);
            //if Row less or equal 1 go down
            if (randomRow <= 1 && randomColumn >= 8) {
                if (setShips[randomRow][randomColumn] == 0) {
                    if (setShips[randomRow + 2][randomColumn - 2] == 0 && setShips[randomRow + 4][randomColumn - 4] == 0 &&
                            setShips[randomRow + 6][randomColumn - 6] == 0 && setShips[randomRow + 8][randomColumn - 8] == 0) {
                        setShips[randomRow][randomColumn] = 5;
                        setShips[randomRow + 2][randomColumn - 2] = 5;
                        setShips[randomRow + 4][randomColumn - 4] = 5;
                        setShips[randomRow + 6][randomColumn - 6] = 5;
                        setShips[randomRow + 8][randomColumn - 8] = 5;
                        setCountAircraftCarrier(5);
                    }

                }
            } else if (randomRow >= 8 && randomColumn <= 1) {
                if (setShips[randomRow][randomColumn] == 0) {
                    if (setShips[randomRow - 2][randomColumn + 2] == 0 && setShips[randomRow - 4][randomColumn + 4] == 0 &&
                            setShips[randomRow - 6][randomColumn + 6] == 0 && setShips[randomRow - 8][randomColumn + 8] == 0) {
                        setShips[randomRow][randomColumn] = 5;
                        setShips[randomRow - 2][randomColumn + 2] = 5;
                        setShips[randomRow - 4][randomColumn + 4] = 5;
                        setShips[randomRow - 6][randomColumn + 6] = 5;
                        setShips[randomRow - 8][randomColumn + 8] = 5;
                        setCountAircraftCarrier(5);
                    }

                }
            }
        }
    }
    protected void upLefToRightDownAndReverse() {
        if(getCountAircraftCarrier()<5) {
            Random randomPosition = new Random();
            int randomRow = randomPosition.nextInt(10);
            int randomColumn = randomPosition.nextInt(10);
            //if Row less or equal 1 go down
            if (randomRow <= 1 && randomColumn <= 1) {
                if (setShips[randomRow][randomColumn] == 0) {
                    if (setShips[randomRow + 2][randomColumn + 2] == 0 && setShips[randomRow + 4][randomColumn + 4] == 0 &&
                            setShips[randomRow + 6][randomColumn + 6] == 0 && setShips[randomRow + 8][randomColumn + 8] == 0) {
                        setShips[randomRow][randomColumn] = 5;
                        setShips[randomRow + 2][randomColumn + 2] = 5;
                        setShips[randomRow + 4][randomColumn + 4] = 5;
                        setShips[randomRow + 6][randomColumn + 6] = 5;
                        setShips[randomRow + 8][randomColumn + 8] = 5;
                        setCountAircraftCarrier(5);
                    }

                }
            } else if (randomRow >= 8 && randomColumn >= 8) {
                if (setShips[randomRow][randomColumn] == 0) {
                    if (setShips[randomRow - 2][randomColumn - 2] == 0 && setShips[randomRow - 4][randomColumn - 4] == 0 &&
                            setShips[randomRow - 6][randomColumn - 6] == 0 && setShips[randomRow - 8][randomColumn - 8] == 0) {
                        setShips[randomRow][randomColumn] = 5;
                        setShips[randomRow - 2][randomColumn - 2] = 5;
                        setShips[randomRow - 4][randomColumn - 4] = 5;
                        setShips[randomRow - 6][randomColumn - 6] = 5;
                        setShips[randomRow - 8][randomColumn - 8] = 5;
                    }

                }
            }
        }
    }

    public void setOneAircraftCarrier(){
        while (getCountAircraftCarrier() < 5){
            aircraftCarrierHorizontal();
            aircraftCarrierVertical();
            upLefToRightDownAndReverse();
            upRightToLeftDownAndReverse();
        }
    }
}
