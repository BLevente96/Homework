import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many dices would you like to play with? '1' '2' '3'");
        int diceNum = sc.nextInt();
        int playerScore = 0;
        int computerScore= 0;

        for (int i = 0; i < 5; i++) {
            int computerThrow= diceRoll(random,diceNum);
            int playerThrow= diceRoll(random,diceNum);

            System.out.println("Computer throws: "+computerThrow);
            System.out.println("Player throws: "+playerThrow);
            playerScore+=playerThrow;
            computerScore+=computerThrow;

            if(diceNum==3&& playerThrow==18){
                System.out.println("Triple 6s Player WINS!");
                return;
            }

        }

        System.out.println("Computer all dice value: "+computerScore);
        System.out.println("Player all dice value: "+playerScore);

        if (playerScore > computerScore) {
            System.out.println("Player WON!");
        } else if (playerScore < computerScore) {
            System.out.println("Computer WON!");
        } else {
            System.out.println("ITS A DRAW!");
        }


    }

    private static int diceRoll(Random random, int diceNum) {
        int diceValue = 0;
        for (int i = 0; i < diceNum; i++) {
            diceValue += random.nextInt(6) + 1;

        }
        return diceValue;
    }


}
