package practices.ppt5;

import java.util.ArrayList;

public class ArrayPlayground {
    public static void main(String[] args) {
        double[] num = new double[10];
        int len = num.length;
        num[1] = 10.34;

        num[9] = 10;

        for (double i : num) {
            System.out.print(i + " ");
        }

        String test = "hello";
        String test2 = test.substring(0, 4);
        System.out.println(test2);

        ArrayList<Integer> haha = new ArrayList<>();
        haha.add(1);
        haha.add(3);
        haha.set(0, 2);
        System.out.println(haha.get(0));
        System.out.println(haha.indexOf(2));
        haha.clear();

    }
}
