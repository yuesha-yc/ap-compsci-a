package labs.ppt5.lab4;

// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if
// each square is magic.
//
// ****************************************************************

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("/Users/wyc/Documents/0GRADE-12th-AP-KBS/CSA/CSA-Codes/src/labs/ppt5/lab4/magicData.txt"));

        int count = 1;                 //count which square we're on
        int size = scan.nextInt();     //size of next square

        //Expecting -1 at bottom of input file
        while (size != -1)
        {

            //create a new Square of the given size
            Square square = new Square(size);

            //call its read method to read the values of the square
            square.readSquare(scan);

            System.out.println("\n******** Square " + count + " ********");
            //print the square
            square.printSquare();

            //print the sums of its rows
            for (int i = 0; i < square.square.length; i++)
                System.out.println("Row " + i + ": " + square.sumRow(i));
            System.out.println();

            //print the sums of its columns
            for (int j = 0; j < square.square.length; j++)
                System.out.println("Column " + j + ": " + square.sumCol(j));
            System.out.println();

            //print the sum of the main diagonal
            System.out.println("Main Diagonal: " + square.sumMainDiag());

            //print the sum of the other diagonal
            System.out.println("Other Diagonal: " + square.sumOtherDiag());

            //determine and print whether it is a magic square
            if (square.magic()) {
                System.out.println("It is a magic square! ");
            } else {
                System.out.println("It is not a magic square. ");
            }

            count ++;

            //get size of next square
            size = scan.nextInt();

        }

    }
}
