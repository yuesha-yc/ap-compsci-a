package practices.ppt4;

public class PalindromeValidator {

    private String str;

    public PalindromeValidator(String input) {
        this.str = input;
    }

    private char getAndRemoveFirst() {
        char first = str.charAt(0);
        str = str.substring(1);
        return first;
    }

    private char getAndRemoveLast() {
        char last = str.charAt(str.length() - 1);
        str = str.substring(0, str.length() - 1);
        return last;
    }

    private boolean compareFirstAndLast() {
        return getAndRemoveFirst() == getAndRemoveLast();
    }

    public boolean isPalindrome() {

        if (!compareFirstAndLast()) {
            return false;
        } else if (str.length() == 1)
            return true;
        else
            return isPalindrome();
    }

}
