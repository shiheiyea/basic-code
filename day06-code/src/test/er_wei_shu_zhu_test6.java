package test;

import java.util.Scanner;

public class er_wei_shu_zhu_test6 {
    public static void main(String[] args) {
        /*
        某系统的数字密码(大于e) 。比如1983，采用加密方式进行传输，
        规则如下:
        每位数加上5
        再对10求余，
        最后将所有数字反转，
        得到一串新数。
        */
        int[] arr = getArr();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        /*
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        */
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
    public static int[] getArr() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        int[] arr = new int[count];
        int index = 0;
        while (temp != 0) {
            arr[index] = temp % 10;
            temp /= 10;
            index++;
        }
        /*
        int index = arr.length - 1;
        while (temp != 0) {
            arr[index] = temp % 10;
            temp /= 10;
            index--;
        }
        */
        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        */
        return arr;
    }
}
