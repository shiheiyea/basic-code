package test;

import java.util.Scanner;

public class pan_duan_he_xun_huang_test3 {
    public static void main(String[] args) {
        /*
           需求:键盘录入一个整数，表示身上的钱。
           如果大于等于100块，就是网红餐厅。
           否则，就吃经济实惠的沙县小吃。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身上的钱：");
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("去网红餐厅吃去，哦吼吼吼");
        }
        else {
            System.out.println("(TAT ) 只能吃沙县了");
        }
    }
}
