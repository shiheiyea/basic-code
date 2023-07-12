package test;

import java.util.Scanner;

public class pan_duan_he_xun_huang_test6 {
    public static void main(String[] args) {
        /*
          根据不同的分数送不同的礼物。
          如果是95~100分，送自行车一辆。
          如果是90~94分，游乐场玩一天。
          如果是80~89分，送变形金刚一个。
          如果是80分以下，揍一顿。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示小明的成绩");
        int  score = sc.nextInt();
        if (0 <= score && score <=100) {
            if (95 <= score && score <= 100) {
                System.out.println("哦吼，送一俩自行车给他");
            } else if (90 <= score && score < 95) {
                System.out.println("哦吼，带他去游乐场玩一天");
            } else if (80 <= score && score < 90) {
                System.out.println("哦吼，送一个变形金刚给他");
            } else {
                System.out.println("给他一个大逼斗");
            }
        }
        else {
            System.out.println("当前的录入的成绩不合法");
        }
    }
}
