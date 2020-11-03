package labs.lab2;

import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/10/13
 * @course AP-CSA Section 1
 * Lab 2 - Ideal Weight
 */
public class IdealWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int baseFemaleWeight = 100;
        final int femaleWeightPerInch = 5;
        final int baseMaleWeight = 106;
        final int maleWeightPerInch = 6;

        int feetHeight;
        int inchHeight;
        System.out.println("Please enter the your height in feet:");
        feetHeight = scanner.nextInt();
        System.out.println("Please enter the your height in inches:");
        inchHeight = scanner.nextInt();

        int totalInchHeight = feetHeight * 12 + inchHeight;
        int idealWeightFemale = baseFemaleWeight + (totalInchHeight - 5 * 12) * femaleWeightPerInch;
        int idealWeightMale = baseMaleWeight + (totalInchHeight - 5 * 12) * maleWeightPerInch;

        System.out.println("Your female ideal weight: " + idealWeightFemale + " pounds");
        System.out.println("Your female ideal weight range: " + idealWeightFemale*0.85 + " pounds" + " - " + idealWeightFemale*1.15 + " pounds");
        System.out.println("Your male ideal weight: " + idealWeightMale + " pounds");
        System.out.println("Your male ideal weight range: " + idealWeightMale*0.85 + " pounds" + " - " + idealWeightMale*1.15 + " pounds");

    }
}
