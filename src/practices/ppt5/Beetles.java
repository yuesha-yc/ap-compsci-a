package practices.ppt5;

import java.util.ArrayList;

public class Beetles {
    public static void main(String[] args) {
        // create the arraylist
        ArrayList<String> band = new ArrayList<String>();
        band.add("Paul"); // add method to insert elements into our arraylist
        band.add("Pete");
        band.add("John");
        band.add("George");
        System.out.println(band);
        // indexOf method gives the position of the element
        band.remove("Pete"); // its gonna remove the element at the location
        System.out.println(band);
        System.out.println("At the index 1 " + band.get(1)); // get method is used to extract specific element
        band.add(2, "Ringo"); // oveloaded add method with two parameters now
        System.out.println("The size of the arraylist is " + band.size()); // gives the no of elements
        int index = 0;
        while (index < band.size()) {
            System.out.println(band.get(index));
            index++;
        }
    }
}
