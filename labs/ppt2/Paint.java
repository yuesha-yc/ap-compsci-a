package labs.ppt2;

import java.util.Scanner;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/10/13
 * @course AP-CSA Section 1
 * Lab 2 - Painting a Room
 */
public class Paint
{
    public static void main(String[] args)
    {
        //paint covers 350 sq ft/gal
        final int COVERAGE = 350;

        // declare integers length, width, and height;
        double length;
        double width;
        double height;
        //declare integers numbers of doors and windows in room;
        double doors;
        double windows;
        //declare double totalSqFt;
        double totalSqFt;
        //declare double paintNeeded;
        double paintNeeded;
        //declare and initialize Scanner object
        Scanner scanner = new Scanner(System.in);

        //Prompt for and read in the length of the room
        length = scanner.nextDouble();
        //Prompt for and read in the width of the room
        width = scanner.nextDouble();
        //Prompt for and read in the height of the room
        height = scanner.nextDouble();
        //Prompt for and read in the number of doors
        doors = scanner.nextInt();
        //Prompt for and read in the number of windows
        windows = scanner.nextInt();

        //Compute the total square feet to be painted--think //about the dimensions of each wall
        totalSqFt = 2 * (length * width + length * height + width * height) - doors * 20 - windows * 15;
        //Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;

        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("Room Length: " + length);
        System.out.println("Room Width: " + width);
        System.out.println("Room Height: " + height);
        System.out.println("Number of gallons of paint needed: " + paintNeeded);
    }
}
