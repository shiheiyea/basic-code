package test;

import java.util.Scanner;

public class duan_lu_lou_ji_yun_suan_fu_test
{
    public static void main(String[] args)
    {
        /*
        数字6是一个真正伟大的数字，键盘录入两个整数。
        如果其中一个为 6，最终结果输出true。
        如果它们的和为 6的倍数。
        最终结果输出true。
        其他情况都是false。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int number2 = sc.nextInt();
        boolean resurt = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(resurt);
    }
}
