package labs.ppt7.lab2;

public class SortedIntList extends IntList {
    public SortedIntList(int size) {
        super(size);
    }

    public void add(int value) {
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else {
            // Find where should we put the value
            int location = 0, i = 0;
            while (list[i] < value && i < numElements) {
                location = i + 1;
                i++;
            }

            // move the right-hand side of the location up one index
            for (i = numElements; i > location; i--) {
                list[i] = list[i - 1];
            }

            // Put the value at the location
            list[location] = value;

            // Increment number of elements
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
