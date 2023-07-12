package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie5;

public class mian_xiang_dui_xiang_xing_jie5 {
    public static void main(String[] args) {
        Zi z1 = new Zi();

        //Zi z2 = new Zi("张三",23);
    }
}

class Fu{
    String name;
    int age;
    public Fu(){}

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu {

    //如果一个类中没有构造方法，虚拟机会自动的给你添加一个默认的空参构造

}
