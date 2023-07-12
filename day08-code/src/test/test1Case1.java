package test;

import java.util.Scanner;

public class test1Case1 {
    public static void main(String[] args) {
        /*
        键盘录入一个字符串，
        要求1:长度为小于等于9
        要求2:只能是数字
                将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系:
        Ⅰ -1、Ⅱ-2、Ⅲ-3、Ⅳ-4、Ⅴ-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、Ⅸ-9注意点:
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成""(长度为0的字符串)
        */
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("请输入一个字符串：");
        while (true) {
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入的字符串不符合规则，请重新输入");
            }
        }

        StringBuilder sb = new StringBuilder();
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int number = ch - '0';
            sb.append(arr[number]);
        }
        System.out.println(sb);
    }

    public static boolean checkStr(String str) {
        if (str.length() <= 9) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch < '0' || '9' < ch) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
