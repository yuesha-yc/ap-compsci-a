package practices.ppt5;

import java.util.Scanner;

public class SalesPeople {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the current number of salespeople: ");
        int currentSalesPeople = scan.nextInt();
        double[] sales = new double[currentSalesPeople];

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter the sale for this salesperson: ");
            sales[i] = scan.nextDouble();
        }

        int totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }

        System.out.println("=================");

        System.out.println("Total sale of company is: " + totalSales);
        System.out.println("Average sales per salesperson: " + totalSales / currentSalesPeople);

        double maxSales = 0, minSales = 99999999;
        int maxPerson = 0, minPerson = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minPerson = i;
                minSales = sales[i];
            }
            if (sales[i] > maxSales) {
                maxPerson = i;
                maxSales = sales[i];
            }
        }

        System.out.println("=================");
        System.out.println("Max Salesperson No. : " + maxPerson);
        System.out.println("Max Sales Amount: " + maxSales);
        System.out.println("Min Salesperson No. : " + minPerson);
        System.out.println("Min Sales Amount: " + minSales);

    }
}
