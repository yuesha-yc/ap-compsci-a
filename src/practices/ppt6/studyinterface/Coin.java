package practices.ppt6.studyinterface;

public class Coin implements Lockable {
    private final int HEADS = 0;
    private final int TAILS = 1;
    private int face;
    private int key;
    private boolean locked = true;

    // Constructor
    public Coin() {
        flip();
    }

    // Method declaration
    public void flip() {
        face = (int) (Math.random() * 2);
    }

    public boolean isHeads() {
        return (face == HEADS);
    }

    public String toString() {
        String faceName;
        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        return faceName;
    }

    @Override
    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public void lock(int key) {
        if (this.key == key) {
            this.locked = true;
        } else {
            System.out.println("Wrong key!");
        }
    }

    @Override
    public void unlock(int key) {
        if (this.key == key) {
            this.locked = false;
        } else {
            System.out.println("Wrong key!");
        }
    }

    @Override
    public boolean locked(int key) {
        if (this.key == key) {
            return this.locked;
        } else {
            System.out.println("Wrong key!");
            return true;
        }
    }
}
