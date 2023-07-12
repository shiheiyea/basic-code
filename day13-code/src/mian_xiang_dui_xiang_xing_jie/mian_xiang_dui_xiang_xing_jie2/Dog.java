package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗狗在吃骨头");
    }
}
