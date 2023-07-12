package test;

import java.util.Random;

public class sun_huang_gao_ji_zhong_he_liang_xi_test5 {
    public static void main(String[] args) {
        //先获取一个随机数。//范围: 0~10
        //2.创建对象
        Random r = new Random();
        //3.生成随机数
        //判断技巧:
        //在小括号中，书写的是生成随机数的范围
        // 这个范围一定是从o开始的。
        //到这个数-1结束
        //口诀: 包头不包尾，包左不包右
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(100);// 0 ~ 99
            System.out.println(number);
        }

    }
}
