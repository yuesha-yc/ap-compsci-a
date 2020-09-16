package labs.lab1;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/9/16
 * Lab1 - Correcting Syntax Errors
 */

// Original Error Program:
// public class problems { // Error: "problems" should be "Problems"
//     public Static main(string[] args) // "Static" should be "static", "string" should be "String", and a "void" should be added before "main"
//     {
//         System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//         System.out.println(This program used to have lots of problems,");  // Missing beginning quotation mark.
//         System.0ut.println("but if it prints this, you fixed them all.") // "0ut" should be "out", a semi-column is missing.
//         System.out.println(" *** Hurray! ***); // Missing ending quotation mark.
//         System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//     }
// }

public class Problems {
    public static void main(String[] args)
    {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("This program used to have lots of problems,");
        System.out.println("but if it prints this, you fixed them all.");
        System.out.println(" *** Hurray! *** ");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}