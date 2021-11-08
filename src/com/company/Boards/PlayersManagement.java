package com.company.Boards;




public class PlayersManagement extends FightBoard {



    public int chooseWhoStartsFirst(int number1, int number2){
        if (number1 > number2) {
            diceResultLabel.setText(firstPlayerName.toUpperCase() + " Will Start The Fight!");
            return 1;

        } else if (number1 < number2) {
            diceResultLabel.setText(secondPlayerName.toUpperCase() + " Will Start The Fight!");
            return 2;

        } else if (number1 == number2){
            //Go again and get a new numbers
            System.out.println("SomethingWrong!");
        }
        return 0;
    }



    public void shootEachOther(int number)  {
        switch (number) {
            case 1: shootFromFirstToSecond();
                break;
            case 2: shootFromSecondToFirst();
                break;
            default:
                System.out.println("SomeThing Wrong");

        }
    }


    public void shootFromFirstToSecond() {
        firstPlayerPane.setDisable(true);
        secondPlayerPane.setDisable(false);
        fightBoard();
    }


    public void shootFromSecondToFirst()  {
        secondPlayerPane.setDisable(true);
        firstPlayerPane.setDisable(false);
        fightBoard();
    }

}
