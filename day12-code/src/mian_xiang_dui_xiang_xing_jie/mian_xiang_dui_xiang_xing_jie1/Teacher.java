package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie1;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("教师信息为" + getName() + ", " + getAge());
    }
}
