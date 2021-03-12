package cncsa.autumn.week13;

public class Kennel {
    public static void main(String[] args) {
        Dog$ dog1 = new Dog$("Mary", 1);
        Dog$ dog2 = new Dog$("Joe", 2);
        dog1.setAge(4);
        dog2.setName("Joseph");
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
