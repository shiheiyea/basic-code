package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie2;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("小羊在吃草");
    }
}
