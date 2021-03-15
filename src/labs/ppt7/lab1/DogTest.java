package labs.ppt7.lab1;

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************

public class DogTest {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Simpson Sr.", "yellow");
        Yorkshire yorkshire = new Yorkshire("Simpson Jr.");

        System.out.println(labrador.getName() + " Labrador Avg. Breed Weight: " + labrador.avgBreedWeight());
        System.out.println(yorkshire.getName() + " Yorkshire Avg. Breed Weight: " + yorkshire.avgBreedWeight());
    }
}
