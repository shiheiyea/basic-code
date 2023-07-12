package test;

import java.util.Scanner;

public class sun_huang_gao_ji_zhong_he_liang_xi_test2 {
    public static void main(String[] args) {
        /*
        需求:
        键盘录入一个大于等于2的整数 x ，计算并返回 x 的平方根
        结果只保留整数部分 ，小数部分将被舍去 。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                System.out.println(i + "就是" + number + "的平方根");
                break;
            }
            else if (i * i > number) {
                System.out.println((i - 1) + "就是" + number + "平方根的整数部分");
                break;
            }
        }
    }
}
