package test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class san_yuan_yun_suan_fu_test1
{
    public static void main(String[] args)
    {
        /*
        需求:动物园里有两只老虎，体重分别为通过键盘录入获得,
        请用程序实现判断两只老虎的体重是否相同。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int number1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int number2 = sc.nextInt();
        String result = number1 == number2 ? "相同" : "不相同";
        System.out.println(result);
    }
}
