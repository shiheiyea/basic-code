package test;

import java.util.Scanner;

public class fang_fa_test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double radius = sc.nextInt();
        getArea(radius);
    }
    public static void getArea (double radius) {
        System.out.println("圆的面积为：" + radius * radius * 3.14);
    }
}
