package labs.lab2;

import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/10/13
 * @course AP-CSA Section 1
 * Lab 2 - Area and Circumference of a Circle
 */
public class Circle {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        int radius;
        System.out.println("Please enter the value of the radius:");
        radius = scanner.nextInt();

        double area1 = PI * radius * radius;
        double circumference1 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
        radius = 2 * radius;
        double area2 = PI * radius * radius;
        double circumference2 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);

        double areaGrowthFactor = area2 / area1;
        System.out.println("The area of the circle grows by a factor of " + areaGrowthFactor);
        double circumferenceGrewFactor = circumference2 / circumference1;
        System.out.println("The circumference of the circle grows by a factor of " + circumferenceGrewFactor);

        // The Area Growth Factor and Circumference Growth Factor hold the same for any value of radius
    }
}
