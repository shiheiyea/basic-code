package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie6;

import java.util.SplittableRandom;

public class mian_xiang_dui_xiang_xing_jie6 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Ye{
    String name = "Ye";
}

class Fu extends Ye{
    String name = "Fu";
}

class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);//ziShow
        System.out.println(this.name);//Zi
        System.out.println(super.name);//Fu
    }
}
