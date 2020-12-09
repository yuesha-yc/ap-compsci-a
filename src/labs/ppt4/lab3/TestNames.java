package labs.ppt4.lab3;

import java.util.Scanner;

public class TestNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tempFirst;
        String tempMid;
        String tempLast;

        System.out.println("Enter the name of the first person...");
        System.out.print("First: ");
        tempFirst = scanner.nextLine();
        System.out.print("Middle: ");
        tempMid = scanner.nextLine();
        System.out.print("Last: ");
        tempLast = scanner.nextLine();
        Name name1 = new Name(tempFirst, tempMid, tempLast);

        System.out.println();

        System.out.println("Enter the name of the second person...");
        System.out.print("First: ");
        tempFirst = scanner.nextLine();
        System.out.print("Middle: ");
        tempMid = scanner.nextLine();
        System.out.print("Last: ");
        tempLast = scanner.nextLine();
        Name name2 = new Name(tempFirst, tempMid, tempLast);

        System.out.println();

        System.out.println("==========");
        System.out.println("Name 1: ");
        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length());

        System.out.println("==========");
        System.out.println("Name 2: ");
        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length());
        System.out.println("==========");

        System.out.println();

        if (name1.equals(name2)) System.out.println("The names are the same!");
        else System.out.println("The names are different!");

    }
}
