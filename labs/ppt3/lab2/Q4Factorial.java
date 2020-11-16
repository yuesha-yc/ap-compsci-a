package labs.ppt3.lab2;

import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/10
 * @course AP-CSA Section 1
 */
//   Question 4. Factorials
public class Q4Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integer;
        int factorial = 1;
        int count = 1;
        System.out.print("Enter the integer with which you want to compute its factorial: ");
        integer = scan.nextInt();

        while (integer < 0) {
            System.out.print("A non-negative number is required to compute its factorial, enter it again: ");
            integer = scan.nextInt();
        }

        if (!(integer == 0)) {
            while (count < integer) {
                count++;
                factorial = factorial * count;
            }
        }

        System.out.println("The factorial of " + integer + " is " + factorial);
    }
}
