package Test.Test6;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        //1.循环
        //2.同步代码块
        //3.判断
        //4.判断
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    System.out.println("在此次抽奖过程中，" + getName() + "总共产生了" + boxList.size() + "个奖项。");
                    System.out.print("分别为: ");
                    int sum = 0;
                    int max = 0;
                    for (int i = 0; i < boxList.size(); i++) {
                        int num = boxList.get(i);
                        if (i == 0) {
                            System.out.print(num);
                        } else {
                            System.out.print(", " + num);
                        }
                        max = Math.max(max, num);
                        sum += num;
                    }
                    System.out.println("最高奖项为" + max + "元，总计额为" + sum + "元");
                    break;
                } else {
                    //继续抽奖
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    boxList.add(prize);
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
