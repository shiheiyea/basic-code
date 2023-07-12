package Thread;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            //不断从阻塞队列中获取面条
            try {
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    /*@Override
    public void run() {
        *//*
         * l.循环
         * 2.同步代码块
         * 3.判断共享数据是否到了末尾(到了末尾)
         * 4.判断共享数据是否到了末尾(没有到末尾，执行核心逻辑)
         **//*
        while (true) {
            synchronized (Desk.Lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    //先判断桌子上是否有面条
                    if (Desk.foodFlag == 0) {
                        //如果没有，就等待
                        try {
                            Desk.Lock.wait();//让当前线程跟锁进行绑定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //把吃的总数-1
                        Desk.count--;
                        //如果有，就开吃
                        System.out.println("吃货在吃面条，还能再吃" + Desk.count + "碗!!!");
                        //吃完之后，唤醒厨师继续做
                        Desk.Lock.notifyAll();
                        //修改桌子的状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }*/
}
