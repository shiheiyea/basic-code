package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie8;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
    }

    public static void show() {
        System.out.println("InterImpl接口中的静态方法");
    }
}
