package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie1;

public class Student extends Person{

    @Override
    public void show() {
        System.out.println("学生信息为" + getName() + ", " + getAge());
    }
}
