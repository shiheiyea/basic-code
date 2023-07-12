package test;

import java.util.Scanner;

public class fang_fa_test3 {
    public static void main(String[] args) {
        //目标: 要能区分出什么时候使用带返回值的方法
        //需求: 定义方法，比较两个长方形的面积
        //定义一个方法求长方形的面积
        //1.我要干嘛?求长方形的面积
        //2.需要什么?长 和 宽
        //3.方法的调用处，是否需要继续使用方法的结果。
        //如果要用，那么方法必须有返回值
        //如果不要用，方法可以写返回值，也可以不写返回值。
        //在以后实际开发当中，我们一般是把重复的代码或者具有独立功能的代码抽取到方法当中。
        //以后我们直接调用就可以了
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个长方形的长：");
        double length1 = sc.nextInt();
        System.out.println("请输入第一个长方形的宽：");
        double wide1 = sc.nextInt();
        System.out.println("请输入第二个长方形的长：");
        double length2 = sc.nextInt();
        System.out.println("请输入第二个长方形的宽：");
        double wide2 = sc.nextInt();
        double area1 = getArea(length1,wide1);
        double area2 = getArea(length2,wide2);
        if (area1 > area2 ) {
            System.out.println("第一个长方形的面积更大");
        }
        else {
            System.out.println("第二个长方形的面积更大");
        }
    }
    public static double getArea (double length, double wide){
        return length * wide;
    }
}
