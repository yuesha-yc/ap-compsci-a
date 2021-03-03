package practices.ppt1;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/9/22
 * @course AP-CSA Section 1
 */

//********************************************************************
//  Facts.java       Author: Lewis/Loftus
//
//  Demonstrates the use of the string concatenation operator and the
//  automatic conversion of an integer to a string.
//********************************************************************

public class Facts {
    //-----------------------------------------------------------------
    //  Prints various facts.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        // Strings can be concatenated into one long string
        System.out.println("We present the following facts for your "
                + "extracurricular edification:");

        System.out.println(); // a blank line

        // A string can contain numeric digits
        System.out.println("Letters in the Hawaiian alphabet: 12");

        // A numeric value can be concatenated to a string
        System.out.println("Dialing code for Antarctica: " + 672);// concatenate a number to a string

        System.out.println("Year in which Leonardo da Vinci invented "
                + "the parachute: " + 1515);

        System.out.println("Speed of ketchup: " + 40 + " km per year");
    }
}
