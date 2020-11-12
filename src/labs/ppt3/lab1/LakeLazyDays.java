package labs.ppt3.lab1;

import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/3
 * @course AP-CSA Section 1
 */
public class LakeLazyDays {
    public static void main(String[] args) {
        double temp;
        String result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current temperature: ");
        temp = scan.nextDouble();

        if (temp >= 80) {
            if (temp > 95) {
                result = "Visit our shops!";
            } else {
                result = "Swimming";
            }
        } else {
            if (temp >= 60) {
                result = "Tennis";
            } else {
                if (temp >= 40) {
                    result = "Golf";
                } else {
                    if (temp < 20) {
                        result = "Visit our shops!";
                    } else {
                        result = "Skiing";
                    }
                }
            }
        }

        System.out.println("Activity Recommended: " + result);
    }
}
