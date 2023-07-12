package test;

import java.util.Random;

public class shu_zhu_test5 {
    public static void main(String[] args) {
        /*
        需求:
        生成10个1~100之间的随机数存入数组。
        1) 求出所有数据的和
        2)求所有数据的平均数
        3) 统计有多少个数据比平均值小
        */
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = r.nextInt(100) + 1;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组的和为：" + sum);
        int avg = sum / arr.length;
        System.out.println("数组的平均数为：" + avg);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum / 10 > arr[i]) {
                count++;
            }
        }
        System.out.println("共有" + count + "个数组小于数组的平均值");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }

    }
}
