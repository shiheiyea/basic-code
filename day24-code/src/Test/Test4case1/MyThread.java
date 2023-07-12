package Test.Test4case1;

import java.util.Random;

public class MyThread extends Thread {
    //共享数据
    //100块， 分成了3个包
    static double money = 100;
    static int count = 3;
    //最小的中奖金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        Random r = new Random();
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println(getName() + "没抢到");
            }  else {
                if ((count == 1)) {
                    System.out.println(getName() + "抢到了" + money + "元");
                    count--;
                }
                else{
                    double prize = r.nextDouble(money - (count - 1) * MIN);
                    if (prize < MIN) {
                        prize = MIN;
                    }
                    money -= prize;
                    count--;
                    System.out.println(getName() + "抢到了" + prize + "元");
                }
            }
        }
    }
}
