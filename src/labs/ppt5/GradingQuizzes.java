package labs.ppt5;


/*
Write a program that grades arithmetic quizzes as follows:
1. Ask the user how many questions are in the quiz.
2. Ask the user to enter the key (that is, the correct answers). There should be one answer for each question in the quiz,
and each answer should be an integer. They can be entered on a single line, e.g., 34 7 13 100 81 3 9 10 321 12
might be the key for a 10-question quiz. You will need to store the key in an array.
3. Ask the user to enter the answers for the quiz to be graded. As for the key, these can be entered on a single line. Again
there needs to be one for each question. Note that these answers do not need to be stored; each answer can simply be
compared to the key as it is entered.
4. When the user has entered all of the answers to be graded, print the number correct and the percent correct.
When this works, add a loop so that the user can grade any number of quizzes with a single key. After the results have been printed for each quiz, ask "Grade another quiz? (y/n)."
 */

import java.util.Scanner;

public class GradingQuizzes {
    public static void main(String[] args) {
        boolean yes = false;

        do {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter number of questions: ");
            int qNum = scan.nextInt();
            int[] answers = new int[qNum];

            System.out.println("Enter the keys for the questions: ");
            for (int i = 0; i < qNum; i++) {
                answers[i] = scan.nextInt();
            }

            int numCorrect = 0;

            System.out.println("Enter the answers for the quiz to be graded: ");
            for (int ans : answers) {
                if (ans == scan.nextInt()) {
                    numCorrect++;
                }
            }

            System.out.println("Correct number: " + numCorrect);
            System.out.println("Correct percentage: " + (double) numCorrect / qNum + "%");

            System.out.println("Grade another quiz? (y/n): ");
            yes = scan.next().equalsIgnoreCase("y");

        } while (yes);
    }
}
