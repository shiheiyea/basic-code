package test;

import java.util.Random;

public class er_wei_shu_zhu_test3 {
    public static void main(String[] args) {
        /*
        需求:
        定义方法实现随机产生一个5位的验证码验证码格式:
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字
        */
        char[] chs = new char[52];
        for (int i = 0; i < 52; i++) {
            if (i <= 25) {
                chs[i] = (char)(97 + i);
            }
            else {
                chs[i] = (char)(65 + i - 26);
            }
        }
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int ranndomIndex = r.nextInt(chs.length);
            result += chs[ranndomIndex];
        }
        int number = r.nextInt(10);
        result += number;
        System.out.println(result);
    }
}
