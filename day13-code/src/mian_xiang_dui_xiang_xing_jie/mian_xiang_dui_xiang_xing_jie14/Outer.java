package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie14;

public class Outer {
    int a = 10;
    static int b = 20;
    static class Inner{
        public void show1() {
            /*Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);*/
            System.out.println("非静态的方法被调用了");
        }
        static public void show2() {
            /*Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);*/
            System.out.println("静态的方法被调用了");
        }
    }
}
