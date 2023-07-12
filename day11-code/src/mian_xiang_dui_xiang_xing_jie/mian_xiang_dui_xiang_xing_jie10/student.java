package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie10;

public class student extends person{
    public student() {
        //子类构造方法中隐藏super（）去访问父类的无参构造
        super();
        System.out.println("子类无参构造");
    }

    public student(String name, int age) {
        super(name,age);
    }
}
