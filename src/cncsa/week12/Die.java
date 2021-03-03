package cncsa.week12;

public class Die {
    private final int MAX = 6;
    private int faceValue;

    public Die() {
        faceValue = 1;
    }

    public int roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        String result = Integer.toString(faceValue);
        return result;
    }
}
