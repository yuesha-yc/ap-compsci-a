package labs.ppt3.lab2;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/10
 * @course AP-CSA Section 1
 */
// ***************************************************************
//   Question 1. Processing Grades
//   Grades.java
//   Read in a sequence of grades and compute the average
//   grade, the number of passing grades (at least 60)
//   and the number of failing grades.
// ***************************************************************

import java.util.Scanner;

public class Q1Grades {
    //---------------------------------------------------------------
    //  Reads in & processes grades until a negative # is entered.
    //---------------------------------------------------------------
    public static void main(String[] args) {
        double grade;  // a student's grade
        double sumOfGrades; // a running total of student grades
        int numStudents; // a count of the students
        int numPass;     // a count of the number who pass
        int numFail;     // a count of the number who fail

        Scanner scan = new Scanner(System.in);

        System.out.println("\nGrade Processing Program\n");

        // Initialize summing and counting variables
        sumOfGrades = 0;
        numStudents = 0;
        numPass = 0;
        numFail = 0;

        // Read in the first grade
        System.out.print("Enter the first student's grade: ");
        grade = scan.nextDouble();


        // The while loop
        while (grade >= 0) {
            sumOfGrades += grade;
            numStudents++;

            if (grade < 60)
                numFail++;
            else
                numPass++;
            // Read the next grade
            System.out.print("Enter the next grade (a negative " + "to quit): ");
            grade = scan.nextDouble();
        }

        if (numStudents > 0) {
            System.out.println("\nGrade Summary: ");
            System.out.println("Class Average: " + sumOfGrades / numStudents);
            System.out.println("Number of Passing Grades: " + numPass);
            System.out.println("Number of Failing Grades: " + numFail);
        } else
            System.out.println("No grades processed.");
    }
}
