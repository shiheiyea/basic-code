package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie3;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("小黑",1);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.Swim();
        Rabbit r = new Rabbit("小白", 1);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();
    }
}
