package labs.ppt4.lab2;

public class BandBooster {
    private final String name;
    private int boxesSold;

    public BandBooster(String aName) {
        name = aName;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int additionalBoxes) {
        boxesSold += additionalBoxes;
    }

    @Override
    public String toString() {
        return getName() + ": " + boxesSold + " boxes";
    }
}
