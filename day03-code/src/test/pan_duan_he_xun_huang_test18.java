package test;

import java.util.Scanner;

public class pan_duan_he_xun_huang_test18 {
    public static void main(String[] args) {
        /*
        需求:
        给你一个整数 x 。
        如果 x 是一个回文整数，打印 true ，否则，返回 false 。
        解释:
        回文数是指正序（从左向右) 和倒序(从右向左) 读都是一样的整数
        例如，121 是回文，而 123 不是。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();
        int y = x;
        int sum = 0;
        while (y != 0) {
            sum = sum * 10 + y % 10;
            y /= 10;
        }
        System.out.println(sum == x);
    }
}
