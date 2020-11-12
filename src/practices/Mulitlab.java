package practices;

import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/12
 * @course AP-CSA Section 1
 */
public class Mulitlab {
    public static void main(String[] args) {
        // Initialization
        int row;
        Scanner scan = new Scanner(System.in);

        // Read the value
        System.out.print("Enter the number of rows and columns you want for the triangle: ");
        row = scan.nextInt();

        // The row
        for (int i = 0; i <= row; i++) {
            // The column
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            // Change row
            System.out.println();
        }
    }
}
