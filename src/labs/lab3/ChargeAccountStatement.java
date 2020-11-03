package labs.lab3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/3
 * @course AP-CSA Section 1
 */
public class ChargeAccountStatement {
    public static void main(String[] args) {
        double previousBalance;
        double newBalance;
        double additionalCharges;
        double interest;
        double minPayment;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current balance: ");
        previousBalance = scan.nextDouble();
        System.out.print("Enter the total amount of additional charges: ");
        additionalCharges = scan.nextDouble();

        // Calculate interest
        if (previousBalance == 0) {
            interest = 0;
        }
        else {
            interest = (previousBalance + additionalCharges) * 0.02;
        }

        // Calculate new balance
        newBalance = previousBalance + additionalCharges + interest;

        // Calculate minimum payment
        if (newBalance < 50) {
            minPayment = newBalance;
        }
        else if (newBalance <= 300) {
            minPayment = 50;
        }
        else {
            minPayment = 0.2 * newBalance;
        }

        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println();
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Previous balance:       " + money.format(previousBalance));
        System.out.println("Additional charges:     " + money.format(additionalCharges));
        System.out.println("Interest:               " + money.format(interest));
        System.out.println();
        System.out.println("New Balance:            " + money.format(newBalance));
        System.out.println();
        System.out.println("Minimum Payment:        " + money.format(minPayment));


    }
}
