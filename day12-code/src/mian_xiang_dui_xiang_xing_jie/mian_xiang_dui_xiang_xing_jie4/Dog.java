package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie4;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public  void lookHome() {
        System.out.println("狗狗在看家");
    }
}
