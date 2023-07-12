package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie10;

public class person {
    String name;
    int age;

    public person() {
        System.out.println("父类的无参构造");
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
