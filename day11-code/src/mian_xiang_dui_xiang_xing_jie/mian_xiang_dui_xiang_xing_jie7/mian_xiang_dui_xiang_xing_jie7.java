package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie7;

public class mian_xiang_dui_xiang_xing_jie7 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

//在继承成员变量中根据就近原则来输出

class Fu{
    String name = "Fu";
    String hobby = "喝茶";
}

class Zi extends Fu{
    String name = "Zi";
    String game = "吃鸡";

    public void show(){
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(super.hobby);
        System.out.println(game);
    }
}
