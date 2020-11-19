package cncsa;

import java.util.Scanner;

public class Week11Bonus {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        // Initialization
        int row = 10;

        // The row
        for (int i = 0; i <= row; i++) {
            // The column
            
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            // Change row
            System.out.println();
        }
    }
}
