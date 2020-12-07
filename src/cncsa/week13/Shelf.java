package cncsa.week13;

public class Shelf {
    private int length;
    private int width;
    private int capacity;
    private boolean occupied;

    public Shelf(int aLength, int aWidth, int aCapacity) {
        occupied = false;
        length = aLength;
        width = aWidth;
        capacity = aCapacity;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
        return "This shelf has " +
                "length=" + length +
                ", width=" + width +
                ", capacity=" + capacity +
                ", and occupied=" + occupied +
                '.';
    }
}
