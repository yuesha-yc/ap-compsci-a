package practices.ppt1;

import java.util.HashSet;

public class Play {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(10);
        mySet.add(100);
        System.out.println(mySet);

        System.out.println("======");
        for (int i : mySet) {
            System.out.println(i);
        }
    }
}
