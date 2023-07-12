package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        /*
        给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
        注意:需要用己有的知识完成。
        */

        //不需要考虑乘积过大之后的结果
        //就认为乘积一定是小于int的最大值的
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String num1 = sc.next();
        System.out.println("请输入第二个字符串：");
        String num2 = sc.next();

        //1.把num1和num2变成对应的整数才可以
        //"123456789"
        //先遍历字符串依次得到每一个字符   '1'    '2'     '3'     '4'     '5'     '6'     '7'     '8'     '9'
        //再把字符变成对应的数字即可        1      2       3       4       5       6       7       8       9
        //把每一个数字组合到一起   123456789
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < num1.length(); i++) {
            char ch = num1.charAt(i);
            sum1 = sum1 * 10 + ch - '0';
        }
        for (int i = 0; i < num2.length(); i++) {
            char ch = num2.charAt(i);
            sum2 = sum2 * 10 + ch - '0';
        }

        //2.利用整数进行相乘
        int sum = sum1 * sum2;

        //3.可以把整数变成字符串
        //+""
        String str = "" + sum;
        System.out.println(str);
    }
}
