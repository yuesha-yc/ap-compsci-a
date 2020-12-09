package labs.ppt4.lab3;

public class Name {
    private String firstName;
    private String midName;
    private String lastName;

    public Name(String first, String middle, String last) {
        firstName = first;
        midName = middle;
        lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidName() {
        return midName;
    }

    public String getLastName() {
        return lastName;
    }

    public String firstMiddleLast() {
        return firstName + " " + midName + " " + lastName;
    }

    public String lastFirstMiddle() {
        return lastName + ", " + firstName + " " + midName;
    }

    public boolean equals(Name otherName) {
        return firstName.equalsIgnoreCase(otherName.getFirstName()) &&
                midName.equalsIgnoreCase(otherName.getMidName()) &&
                lastName.equalsIgnoreCase(otherName.getLastName());
    }

    public String initials() {
        return firstName.substring(0,1).toUpperCase() +
                midName.substring(0,1).toUpperCase() +
                lastName.substring(0,1).toUpperCase();
    }

    public int length() {
        return firstName.length() + midName.length() + lastName.length();
    }
}
