package test;

import java.util.Scanner;

public class er_wei_shu_zhu_test7 {
    public static void main(String[] args) {
        //需求:
        //把整数上的每一位都添加到数组当中
        //反向推导
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        int[] arr = new int[count];
        int index = arr.length - 1;
        while (temp != 0) {
            arr[index] = temp % 10;
            temp /= 10;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
