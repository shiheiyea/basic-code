package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie7;

public class InterAImpl implements InterA, InterB{
    @Override
    public void method() {
        System.out.println("实现类的抽象方法");
    }

    @Override
    public void show() {
        System.out.println("重写接口的默认方法");
    }
}
