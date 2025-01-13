import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Give me a number between 1-6");
        int number = sc.nextInt();
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException("Please give a number between 1 and 6 ");
        }

        int dice = 0;
        int diceThrows = 0;

        while (dice != number) {

            dice = random.nextInt(6) + 1;
            System.out.println("The dice ladned on:" + dice);
            diceThrows++;

        }

        System.out.println("The number we had to throw a dice to get your number: " + diceThrows);


    }
}
