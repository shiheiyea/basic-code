package test;

import java.util.Scanner;

public class fang_fa_test1 {
    public static void main(String[] args) {
        //需求: 定义一个方法，求长方形的周长，将结果在方法中进行打印。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长：");
        double length = sc.nextInt();
        System.out.println("请输入长方形的宽：");
        double wide = sc.nextInt();
        getLength(length, wide);
}
    public static void getLength(double length, double wide) {
        System.out.println("长方形的面积为：" + length * wide);
    }
}
