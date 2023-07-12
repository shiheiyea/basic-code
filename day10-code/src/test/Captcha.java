package test;

import java.util.ArrayList;
import java.util.Random;

public class Captcha {
    public static void main(String[] args) {
        System.out.println(getCode());
    }

    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }

        //从集合里选出4个字母放进容器里
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char ch = list.get(index);
            sb.append(ch);
        }
        //随机出数字
        int number = r.nextInt(10);
        sb.append(number);
        //转换为数组将数字随机插入
        char[] arr = sb.toString().toCharArray();

        int randomIndex = r.nextInt(arr.length);
        char temp =  arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }
}
