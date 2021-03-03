package labs.ppt2;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/10/13
 * @course AP-CSA Section 1
 * Lab 2 - Area and Circumference of a Circle
 */
public class Circle2 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        int radius = 10;
        double area1 = PI * radius * radius;
        double circumference1 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
        radius = 20;
        double area2 = PI * radius * radius;
        double circumference2 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);

        double areaGrewFactor = area2 / area1;
        System.out.println("The area of the circle grows by a factor of " + areaGrewFactor);
        double circumferenceGrewFactor = circumference2 / circumference1;
        System.out.println("The circumference of the circle grows by a factor of " + circumferenceGrewFactor);
    }
}
