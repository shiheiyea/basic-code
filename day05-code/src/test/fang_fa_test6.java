package test;

import com.sun.source.tree.ArrayTypeTree;

import java.util.Scanner;

public class fang_fa_test6 {
    public static void main(String[] args) {
        //需求:设计一个方法求数组的最大值，并将最大值返回
        int[] arr = {1,2,3,4,5};
        int max = max(arr);
        System.out.println(max);
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
