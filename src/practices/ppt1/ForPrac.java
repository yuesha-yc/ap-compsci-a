package practices.ppt1;

import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/12
 * @course AP-CSA Section 1
 */
public class ForPrac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int largest = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Input an integer: ");
            input = scan.nextInt();
            if (input > largest) {
                largest = input;
            }
        }
        System.out.println("The largest number is " + largest);
    }
}
