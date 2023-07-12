package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie15;

public class Outer {
    int b = 20;

    public void show() {

        int a = 10;
        class Inner {
            String name;
            int age;

            public void method1() {
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的method1方法");
            }
            static void method2() {
                System.out.println("局部内部类中的method2静态方法");
            }
        }

        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }
}
