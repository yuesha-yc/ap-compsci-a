package practices.ppt5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PitchSurvey {

    public static void main(String[]args) {

        DecimalFormat fmt = new DecimalFormat("0.#");
        Scanner scanner = new Scanner(System.in);

        int[][] pitchArray = {
                {45,105,67},
                {81,100,93,25,128,88},
                {45,53},
                {79,107,53,79},
                {11,9,3,63,20,18,3}};

        System.out.println("Information:\n");

        for (int pitch = 0; pitch < pitchArray.length; pitch++) {

            int total = 0;
            String avg;
            int max = -999999;
            int min = 999999;
            System.out.println("Pitcher #" + (pitch + 1) + " pitched " + pitchArray[pitch].length + " games");

            for (int num : pitchArray[pitch]) {
                total += num;
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            avg = fmt.format((float) total / pitchArray[pitch].length);

            System.out.println("Largest pitch count: " + max +
                    "\nSmallest pitch count: " + min +
                    "\nTotal pitch count: " + total +
                    "\nAverage pitch count: " + avg + "\n"
                    );

        }

        System.out.println("Enter the pitch number you want to print the stats for: ");
        int pitchNo = scanner.nextInt();

        int total = 0;
        String avg;
        int max = -999999;
        int min = 999999;
        System.out.println("Pitcher #" + pitchNo + " pitched " + pitchArray[pitchNo - 1].length + " games");

        for (int num : pitchArray[pitchNo - 1]) {
            total += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        avg = fmt.format((float) total / pitchArray[pitchNo - 1].length);

        System.out.println("Largest pitch count: " + max +
                "\nSmallest pitch count: " + min +
                "\nTotal pitch count: " + total +
                "\nAverage pitch count: " + avg + "\n"
        );

    }

}
