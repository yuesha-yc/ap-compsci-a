package practices.ppt5;

public class ArrayPlayground {
    public static void main(String[] args) {
        double[] num = new double[1000];
        int len = num.length;
        num[1] = 10.34;
        System.out.println(num[1]);
        for (double i : num) {
            System.out.print(i);
        }
    }
}
