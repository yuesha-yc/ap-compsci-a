package labs.ppt3.lab2;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/11/10
 * @course AP-CSA Section 1
 */
// ****************************************************************
//   Question 3. Powers of 2
//   PowersOf2.java
//   Print out as many powers of 2 as the user requests
// ****************************************************************

import java.util.Scanner;

public class Q3PowersOf2 {
    public static void main(String[] args) {
        int numPowersOf2;      //How many powers of 2 to compute
        int nextPowerOf2 = 1;  //Current power of 2
        int exponent;          //Exponent for current power of 2, this also serves as a counter for the loop
        Scanner scan = new Scanner(System.in);
        System.out.println("How many powers of 2 do you want?");
        numPowersOf2 = scan.nextInt();

        //print a message saying how many powers of 2 will be printed
        System.out.println("Here are the first " + numPowersOf2 + " powers of 2:");
        exponent = 0;
        while (exponent < numPowersOf2) {
            System.out.println("2^" + exponent + " = " + nextPowerOf2); //print out current power of 2
            nextPowerOf2 = nextPowerOf2 * 2; //find next power of 2 -- how do you get this from last?
            exponent += 1; //increment exponent
        }
    }
}
