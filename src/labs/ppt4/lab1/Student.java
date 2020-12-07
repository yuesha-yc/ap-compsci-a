package labs.ppt4.lab1;

// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

/**
 * AP-CSA Section 1 Kevin Wang
 */
public class Student
{
    //declare instance data
    private String name;
    private int score1;
    private int score2;

    Scanner scan = new Scanner(System.in);

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        name = studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter " + name + "'s score for test 1");
        score1 = scan.nextInt();
        System.out.println("Enter " + name + "'s score for test 2");
        score2 = scan.nextInt();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage()
    {
        return (double) (score1 + score2) / 2;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "  Test1: " + score1 + "  Test2: " + score2;
    }
}
