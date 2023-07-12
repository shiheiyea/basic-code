package API.Integer;

import java.util.Scanner;

public class IntegerDemo5 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        /*
        String str = sc.next();
        System. out. print1n(str);
        */
        //弊端:
        //当我们在使用next，nextInt，nextDouble 在接收数据的时候，遇到空格，回车，制表符的时候就停止了
        //键盘录入的是123123那么此时只能接收到空格前面的数据
        //我想要的是接收一整行数据
        //约定:
        //以后我们如果想要键盘录入，不管什么类型，统一使用nextLine
        //特点遇到回车才停止
        String line = sc.nextLine();
        System.out.println(line);


        double v = Double.parseDouble(line);
        System.out.println(v);

    }
}
