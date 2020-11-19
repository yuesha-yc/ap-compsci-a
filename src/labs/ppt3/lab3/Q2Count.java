package labs.ppt3.lab3;

// **********************************************************
//   Question 2. Counting Characters
//   Count.java
//
//   This program reads in strings (phrases) and counts the
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Q2Count
{
    public static void main (String[] args) {
        String quitOrNot = "not";
        Scanner scan = new Scanner(System.in);

        while (!quitOrNot.equals("quit")) {

            String phrase;    // a string of characters
            int countBlank;   // the number of blanks in the phrase
            int length;       // the length of the phrase
            char ch;          // an individual character in the string

            int countA;
            int countE;
            int countS;
            int countT;


            // Print a program header
            System.out.println();
            System.out.println("Character Counter");
            System.out.println();

            // Read in a string and find its length
            System.out.print("Enter a sentence or phrase: ");
            phrase = scan.nextLine();
            length = phrase.length();

            // Initialize counts
            countBlank = 0;
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;

            // a for loop to go through the string char by char
            // and count the blank spaces
            for (int i = 0; i < length; i++) {
                ch = phrase.charAt(i);

                switch (ch) {
                    case 'a':
                    case 'A':
                        countA++;
                        break;
                    case 'e':
                    case 'E':
                        countE++;
                        break;
                    case 's':
                    case 'S':
                        countS++;
                        break;
                    case 't':
                    case 'T':
                        countT++;
                        break;
                    case ' ':
                        countBlank++;
                    default:
                        break;
                }
            }

            // Print the results
            System.out.println();
            System.out.println("Number of blank spaces: " + countBlank);
            System.out.println("Number of A: " + countA);
            System.out.println("Number of E: " + countE);
            System.out.println("Number of S: " + countS);
            System.out.println("Number of T: " + countT);
            System.out.println();

            System.out.println("Enter \"quit\" to quit the program, and enter anything else to run the program again!! ");
            quitOrNot = scan.nextLine();
        }
    }
}


