package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie3;

import mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie2.Animal;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗狗在吃骨头");
    }

    @Override
    public void Swim() {
        System.out.println("狗刨");
    }
}
