package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie6.Test2;

import mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie5.Test.Student;

public class Test {
    public static void main(String[] args) {
        /*
            final 修改基本数据类型:
                记录的值不能发生改变
            final 修饰引用数据类型:
                记录的地址值不能发生改变，内部的属性值还是可以改变的
            核心:
                常量记录的数据是不能发生改变的。

        */

        final double pi = 3.14;
        //pi = 2;

        final Student s = new Student();
        //记录的地址值不能发生改变，内部的属性值还是可以改变的
        //s = new Student();
        s.setName("黑夜");
        s.setAge(18);
        System.out.println(s.getName() + ", " + s.getAge());

        //数组
        final int[] arr = {1,2,3,4,5};
        //arr = new int[10];
        arr[0] = 6;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
