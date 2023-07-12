package Test.Test4case2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MyThread extends Thread {
    //共享数据
    //100块， 分成了3个包
    static BigDecimal money = BigDecimal.valueOf(100.0);
    static int count = 3;
    //最小的中奖金额
    static final BigDecimal MIN = BigDecimal.valueOf(0.01);

    @Override
    public void run() {
        Random r = new Random();
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println(getName() + "没抢到");
            } else {
                BigDecimal prize;
                if ((count == 1)) {
                    prize = money;
                } else {
                    prize = BigDecimal.valueOf(r.nextDouble(money.subtract(BigDecimal.valueOf(count - 1) .multiply(MIN)).doubleValue()));
                }
                prize = prize.setScale(2, RoundingMode.HALF_UP);
                money = money.subtract(prize);
                count--;
                System.out.println(getName() + "抢到了" + prize + "元");
            }
        }
    }
}
