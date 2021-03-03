package practices.ppt3;

import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/9
 * @course AP-CSA Section 1
 */
public class PPT3_Prelab2 {
    public static void main(String[] args) {
        q4();
    }

    public static void q2() {
        final int LIMIT = 16;
        int count = 0;
        int sum = 0;
        int nextVal = 2;

        while (sum < LIMIT) {
            sum = sum + nextVal;
            nextVal = nextVal + 2;
            count = count + 1;
        }

        System.out.println("Had to add together " + (count - 1) +
                " even numbers " + "to reach value " + LIMIT + ".  Sum is "
                + sum);
    }

    public static void q3() {
        int count = 0;
        while (count < 100) {
            count++;
            System.out.println("I love computer science!!");
        }
    }

    public static void q4() {
        int sum = 0;                                    //setup
        String keepGoing = "y";
        int nextVal;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter the next integer: ");        //do work
            nextVal = scan.nextInt();
            sum = sum + nextVal;
            count++; // ADDITION

            System.out.println("Type y or Y to keep going");    //update
            keepGoing = scan.next();
        }

        System.out.println("The sum of your " + count + " integers is " + sum);
    }
}
