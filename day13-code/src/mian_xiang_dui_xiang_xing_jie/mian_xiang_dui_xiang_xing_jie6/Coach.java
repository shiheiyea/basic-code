package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie6;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
