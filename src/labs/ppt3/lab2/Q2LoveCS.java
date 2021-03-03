package labs.ppt3.lab2;

import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/10
 * @course AP-CSA Section 1
 */
// ****************************************************************
//   Question 2. Counting and Looping
//   LoveCS.java
//   Use a while loop to print many messages declaring your
//   passion for computer science
// ****************************************************************

public class Q2LoveCS {

    public static void main(String[] args) {
        final int LIMIT = 10;
        int count = 1;
        int sum = 0;

        int time;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many times you want to print: ");
        time = scan.nextInt();

        while (count <= time) {
            System.out.println(count + " I love Computer Science!!");
            sum += count;
            count++;
        }
        System.out.println("Printed this message " + (count - 1) + " times. The sum of the numbers from 1 to " + (count - 1) + " is " + sum + ".");
    }
}
