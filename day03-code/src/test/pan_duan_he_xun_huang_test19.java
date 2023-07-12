package test;

import java.util.Scanner;

public class pan_duan_he_xun_huang_test19 {
    public static void main(String[] args) {
        /*
        需求:
        给定两个整数，被除数和除数(都是正数，且不超过int的范围)。
        将两数相除，要求不使用乘法、除法和 % 运算符。
        得到商和余数。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数为被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入一个整数为除数：");
        int divisor = sc.nextInt();
        int count = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }
        System.out.println("商为：" + count);
        System.out.println("余数为：" + dividend);
    }
}
