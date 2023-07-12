package mian_xiang_dui_xiang.test3;

public class GirlFriend {
    private int age;
    public void method() {
        int age = 10;
        System.out.println(age);
        //this引用成员变量而不是局部变量
        System.out.println(this.age);
    }
}
