package test;

import java.util.Scanner;

public class pan_duan_he_xun_huang_test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //小红:如果你这次考试全班第一，我就做你女朋友。
        //分析:
        //1.定义变量记录小明的名次
        int ranking = sc.nextInt();
        // 2.对小明的名次进行判断。
        if(ranking == 1) {
            System.out.println("小红成为了小明的女朋友");
        }
    }
}
