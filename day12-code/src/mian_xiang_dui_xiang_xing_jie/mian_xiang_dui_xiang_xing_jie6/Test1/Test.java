package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie6.Test1;

public class Test {
    public static void main(String[] args) {
        /*
    final修饰方法:
            表明该方法是最终方法，不能被重写
    final修饰类:
            表明该类是最终类，不能被继承
    final修饰变量:
            叫做常量，只能被赋值一次
     */

        final int a = 10;
        System.out.println(a);

        //a = 20;
    }
}

class Fu {
    public final void show() {
        System.out.println("父方法的show");
    }
}

class Zi extends Fu{
    /*@Override
    public void show() {
        System.out.println("子方法的show");
    }*/
}
