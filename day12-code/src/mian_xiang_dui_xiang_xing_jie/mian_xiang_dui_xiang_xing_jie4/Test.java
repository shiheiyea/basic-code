package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie4;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog(2,"黄");
        Person p1 = new Person("老王",25);
        p1.keepPet(d,"骨头");

        Cat c = new Cat(1,"白");
        Person p2 = new Person("老六", 26);
        p2.keepPet(c,"鱼");
    }
}
