package labs.ppt7.lab3;

/**
 * This is a class to study polymorphism
 *
 *
 *
 *          Statement                       Output
 *         ------------------------------------------------------------
 *
 *         var1.method1();                 One1________________________
 *
 *         var2.method1();                 One1________________________
 *
 *         var3.method1();                 Four1 One1__________________
 *
 *         var4.method1();                 Four1 One1__________________
 *
 *         var5.method1();                 compile-time error__________
 *
 *         var6.method1();                 One1________________________
 *
 *         var4.method2();                 Three2 Four1 One1___________
 *
 *         var4.method3();                 compile-time error__________
 *
 *         ((Two)var1).method2();          compile-time error__________
 *
 *         ((Three)var1).method2();        run-time error______________
 *
 *         ((Two)var1).method3();          Two3________________________
 *
 *         ((Four)var2).method1();         compile-time error__________
 *
 *         ((Four)var3).method1();         Four1 One1__________________
 *
 *         ((Four)var4).method3();         Four3_______________________
 *
 *         ((One)var5).method1();          One1________________________
 *
 *         ((Four)var5).method2();         run-time error______________
 *
 *         ((Three)var5).method2();        Three2 One1_________________
 *
 *         ((One)var6).method1();          One1________________________
 *
 *         ((One)var6).method2();          compile-time error__________
 *
 *         ((Two)var6).method3();          run-time error______________
 */

public class Polymorphism {
    public static class One {
        public void method1() {
            System.out.println("One1");
        }
    }

    public static class Two extends One {
        public void method3() {
            System.out.println("Two3");
        }
    }

    public static class Three extends One {
        public void method2() {
            System.out.println("Three2");
            method1();
        }
    }

    public static class Four extends Three {
        public void method1() {
            System.out.println("Four1");
            super.method1();
        }

        public void method3() {
            System.out.println("Four3");
        }
    }

    public static void main(String[] args) {
        One var1 = new Two();
        One var2 = new Three();
        One var3 = new Four();
        Three var4 = new Four();
        Object var5 = new Three();
        Object var6 = new One();
        /*
        var4.method2();
        var5.method1(); CTE
        var4.method3(); CTE
        ((Three)var1).method2(); RTE
        ((Two)var1).method3();
        ((Four)var2).method1(); CTE
        ((Four)var3).method1();
        ((Four)var4).method3();
        ((One)var5).method1();
        ((Four)var5).method2();
        ((Three)var5).method2();
        ((One)var6).method1();
        ((One)var6).method2(); CTE
        ((Two)var6).method3(); RTE
        */

    }

}
