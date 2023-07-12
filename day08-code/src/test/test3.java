package test;

import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘输入任意字符串，打乱里面的内容
        //1.键盘输入任意字符串

        //2.打乱里面的内容

        //修改字符串里面的内容:
        //1.subString
        // 2.变成字符数组
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        char[] arr = str.toCharArray();

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(arr.length);
            char ch = arr[i];
            arr[i] = arr[number];
            arr[number] = ch;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
