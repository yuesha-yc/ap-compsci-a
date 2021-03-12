package cncsa.autumn.week13;

public class ShelfCheck {
    public static void main(String[] args) {
        Shelf shelfA = new Shelf(10, 10, 50);
        Shelf shelfB = new Shelf(20, 20, 400);
        shelfA.setCapacity(100);
        shelfB.setOccupied(true);
        System.out.println(shelfA);
        System.out.println(shelfB);
    }
}
