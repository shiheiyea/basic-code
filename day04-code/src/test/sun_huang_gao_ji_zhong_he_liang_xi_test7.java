package test;

import java.util.Random;
import java.util.Scanner;

public class sun_huang_gao_ji_zhong_he_liang_xi_test7 {
    public static void main(String[] args) {
        //需求: 程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少?
        //扩展小需求:加一个保底机制，3次猜不中，直接提示猜中了。
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int guessNumber = r.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入一个您要猜的数字：");
            int number = sc.nextInt();
            if (number == guessNumber || count == 3) {
                System.out.println("恭喜你猜对了！");
                break;
            }
            else if (number > guessNumber) {
                System.out.println("猜大了呢,再猜一次吧");
            }
            else {
                System.out.println("猜小了呢,再猜一次吧");
            }
            count++;
        }
    }
}
