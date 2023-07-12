package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie3;

public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔兔在吃胡萝卜");
    }
}
