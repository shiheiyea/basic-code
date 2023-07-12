package String;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String str = sc.next();
        String result = reverser(str);
        System.out.println(result);
    }
    public static String reverser(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            result += ch;
        }
        return result;
    }
}
