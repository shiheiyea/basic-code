package test;

import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        /*
        生成验证码
        内容:可以是小写字母，也可以是大写字母，还可以是数字规则:
        长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意的位置。
        */
        //1.可以把所有的大写字母，小写字母都放到一个数组当中
        char[] arr = new char[52];
        //a-z A-Z
        for (int i = 0; i < 52; i++) {
            if (i < 26) {
                arr[i] = (char)('a' + i);
            }
            else {
                arr[i] = (char)('A' + i - 26);
            }
        }
        //2.从数组中随机获取4次
        char[] newArr = new char[5];
        Random r = new Random();
        for (int i = 0; i < newArr.length; i++) {
            if (i == newArr.length - 1) {
                int num = r.nextInt(10);
                newArr[i] = (char)('0' + num);
            }
            else {
                int num = r.nextInt(arr.length);
                newArr[i] = arr[num];
            }
        }

        //3.生成一个0 ~ 9之间的随机数拼接到最后
        //ACFG7
        //思考，我们把7放到前面，修改了字符串的内容
        //把生成的验证码先变成一个字符数组
        //再让最后一个元素跟前面的随机位置的元素进行交换
        //交换完毕之后再变成字符串就可以了。

        int num = r.nextInt(newArr.length);
        char temp = newArr[num];
        newArr[num] = newArr[newArr.length - 1];
        newArr[newArr.length - 1] = temp;

        String str = new String(newArr);
        System.out.println(str);
    }
}
