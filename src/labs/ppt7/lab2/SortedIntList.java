package labs.ppt7.lab2;

public class SortedIntList extends IntList {
    public SortedIntList(int size) {
        super(size);
    }

    public void add(int value) {
        System.out.println("Number of Elements: " + numElements);
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else {
            int[] tempArray = list;
            if (numElements == 0) {
                list[numElements] = value;
            } else {
                for (int i = 0; i < numElements; i++) {
                    System.out.println("Index " + i);
                    // if new value is smaller than this num, we replace it
                    if (value < list[i]) {
                        // replace it
                        list[i] = value;
                        // put all rest values in the previous list an index later
                        for (int j = i + 1; j < numElements; j++) {
                            list[j] = tempArray[j - 1];
                        }
                        break;
                    }
                }
            }
            numElements++;
        }
    }

    public String toString() {
        String returnString = "";
        for (int i = 0; i < list.length; i++)
            returnString += i + ": " + list[i] + "\n";
        return returnString;
    }
}
