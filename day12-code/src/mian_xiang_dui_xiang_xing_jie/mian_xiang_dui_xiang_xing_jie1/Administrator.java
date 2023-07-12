package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie1;

public class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员信息为" + getName() + ", " + getAge());
    }
}
