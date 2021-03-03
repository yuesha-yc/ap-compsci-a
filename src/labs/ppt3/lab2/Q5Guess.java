package labs.ppt3.lab2;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/10
 * @course AP-CSA Section 1
 */
// ****************************************************************
//   Question 5. A Guessing Game
//   Guess.java
//   Play a game where the user guesses a number from 1 to 10
// ****************************************************************

import java.util.Scanner;

public class Q5Guess {
    public static void main(String[] args) {
        boolean play = true;
        while (play) {
            int numToGuess;       //Number the user tries to guess
            int guess;            //The user's guess
            int count = 1;
            int countTooLow = 0;
            int countTooHigh = 0;

            Scanner scan = new Scanner(System.in);

            numToGuess = (int) (Math.random() * 100) + 1;

            //print message asking user to enter a guess
            System.out.print("Enter a guess for the number: ");
            //read in guess
            guess = scan.nextInt();

            while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
                count++;
                //print message saying guess is wrong
                if (guess < numToGuess) {
                    countTooLow++;
                    System.out.print("You number is too low, try again: ");
                } else {
                    countTooHigh++;
                    System.out.print("You number is too high, try again: ");
                }
                //get another guess from the user
                guess = scan.nextInt();
            }

            System.out.println();
            System.out.println("=============================");
            System.out.println("Congratulations! ");
            System.out.println("You guessed the correct number within " + count + " guesses. ");
            System.out.println(countTooLow + " of them are too low and " + countTooHigh + " are too high. ");

            System.out.print("Enter (y or Y) to play again or enter any other thing to quit the game: ");
            String willPlay = scan.next();
            if (!willPlay.equalsIgnoreCase("y")) play = false;
            System.out.println("=============================");
            System.out.println();
        }
    }
}
