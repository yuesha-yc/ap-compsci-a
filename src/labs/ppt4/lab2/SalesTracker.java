package labs.ppt4.lab2;

import java.util.Scanner;

public class SalesTracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the first band booster: ");
        BandBooster bandBooster1 = new BandBooster(scan.nextLine());
        System.out.print("Enter the name of the second band booster: ");
        BandBooster bandBooster2 = new BandBooster(scan.nextLine());
        for (int week = 1; week <= 3; week++) {
            System.out.println();
            System.out.println("- Week " + week + " -");
            System.out.print("Enter the number of boxes sold by " + bandBooster1.getName() + " this week: ");
            bandBooster1.updateSales(scan.nextInt());
            System.out.print("Enter the number of boxes sold by " + bandBooster2.getName() + " this week: ");
            bandBooster2.updateSales(scan.nextInt());
        }
        System.out.println();
        System.out.println("====================");
        System.out.println(bandBooster1);
        System.out.println(bandBooster2);
    }
}
