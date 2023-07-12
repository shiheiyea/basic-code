package mian_xiang_dui_xiang.test4;

public class Student {
    private String name;
    private int age;

    //如果我们自己没有写任何的构造方法
    //那么虚拟机给我们加一个不带参数方法
    public Student() {
        System.out.println("猜猜我执行了吗？");
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
