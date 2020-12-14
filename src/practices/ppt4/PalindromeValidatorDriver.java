package practices.ppt4;

public class PalindromeValidatorDriver {
    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator("racdsssedcar");
        System.out.println(palindromeValidator.isPalindrome());
    }
}
