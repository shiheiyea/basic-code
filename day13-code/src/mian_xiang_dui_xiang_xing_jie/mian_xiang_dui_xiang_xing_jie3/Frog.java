package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie3;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void Swim() {
        System.out.println("青蛙在蛙泳");
    }
}
