package String;

import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch < 'z') {
                bigCount++;
            }
            else if ('A' <= ch && ch <= 'Z') {
                smallCount++;
            }
            else if ('0' <= ch && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("小写字母个数：" + bigCount);
        System.out.println("大写字母个数：" + smallCount);
        System.out.println("数字字符个数：" + numberCount);
    }
}
