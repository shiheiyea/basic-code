package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie2;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("小黑",2);
        Frog f = new Frog("小绿",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();
    }
}
