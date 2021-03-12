package cncsa.spring;

public class Week1TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][10];

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][j] = j * 10 + i;
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
