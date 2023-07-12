package test;

import java.util.Scanner;

public class sun_huang_gao_ji_zhong_he_liang_xi_test3 {
    public static void main(String[] args) {
        //需求: 健盘录入一个正整数 x ，判断该整数是否为一个质数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是质数");
        }
        else {
            System.out.println(number + "不是质数");
        }
    }
}
