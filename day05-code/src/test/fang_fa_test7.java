package test;

import java.awt.*;

public class fang_fa_test7 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
        int[] arr = {1,2,3,4,5};
        boolean flag = contains(arr, 189);
        System.out.println(flag);
    }
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
