package labs.ppt1;

// ********************************************
// Hello.java //
// Print a Hello, World message.
//
// 2. Change name: Error:(15, 8) java: class Helo is public, should be declared in a file named Helo.java
// 3. Misspelling in string: No error because String can contain any character and the words in the String are
// not necessarily correct in spelling for the program to run. The message output becmes "Helo, World!"
// after the change.
// 4. No ending quotation mark in a string literal: Error:(24, 29) java: unclosed string literal.
// 5. No beginning quotation mark in a string literal: Error:(25, 40) java: ')' expected.
// 6. No semicolon after a statement: Error:(26, 44) java: ';' expected
// ********************************************

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/9/16
 * Lab1 - Recognizing Syntax Errors
 */
public class Hello {
    // -----------------------------------
    // main method -- prints the greeting
    // -----------------------------------
    public static void main(String[] args) {
        System.out.println("Helo, World!");
    }
}
