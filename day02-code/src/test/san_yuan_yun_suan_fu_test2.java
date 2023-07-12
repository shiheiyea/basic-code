package test;

import java.util.Scanner;

public class san_yuan_yun_suan_fu_test2
{
    public static void main(String[] args)
    {
        /*
          需求:一座寺庙里住着三个和尚，
          已知他们的身高210m,165cm分别为150cm,
          请用程序实现获取这三个和尚的最高身高。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高:");
        int a = sc.nextInt();
        System.out.println("请输入第二个和尚的身高:");
        int b = sc.nextInt();
        System.out.println("请输入第三个和尚的身高:");
        int c = sc.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        //int max = a > b && a > c ? a : b > a && b > c ? b : c > a && c > b ? c : 0;
        //ctrl + alt + l 自动格式化代码
        System.out.println(max);
    }
}
