package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie12;

import mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie10.Inter;

public class Outer {
    String name;
    public Inner getInstance(){
        return new Inner();
    }
    private class Inner{
        static int a = 10;
    }
}
