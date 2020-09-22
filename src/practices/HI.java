package practices;

/**
 * @author Kevin (Yichen Wang)
 * Date Created: 2020/9/18
 * @course AP-CSA Section 1
 */
public class HI {
    public static void main(String[] args) {
//        System.out.println("#########");
//        System.out.println(" ####### ");
//        System.out.println("  #####  ");
//        System.out.println("   ###   ");
//        System.out.println("    #    ");
//        System.out.println("   ###   ");
//        System.out.println("  #####  ");
//        System.out.println(" ####### ");
//        System.out.println("#########");
        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < i; j += 1) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j -= 1) {
                System.out.print("#");
            }
            System.out.println("");
        }

        for (int i = 0; i < 6; i += 1) {
            for (int j = 5; j > i; j -= 1) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j += 1) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}
