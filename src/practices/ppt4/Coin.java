package practices.ppt4;

public class Coin {
    private final int HEADS = 0;
    private final int TAILS = 1;
    private int face;

    // Constructor
    public Coin() {
        flip();
    }

    // Method declaration
    public void flip() { // void is the return type of this method
        face = (int)(Math.random() * 2); // face will either be one or zero.
    }

    public boolean isHeads() { // boolean is the return type of this method
        return (face == HEADS);
    }

    public String toString() { // String is the return type
        String faceName; // local variable because it is declared inside a method. Inaccessible outisde.
        if (face == HEADS) {
            faceName = "Heads";
        }
        else {
            faceName = "Tails";
        }
        return faceName;
    }
}
