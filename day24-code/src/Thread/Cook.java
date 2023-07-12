package Thread;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            //不断从阻塞队列中获取面条
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
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
                    //判断桌子上是否有食物
                    if (Desk.foodFlag == 1) {
                        //如果有，就等待
                        try {
                            Desk.Lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //如果没有，就制作食物
                        System.out.println("厨师做了一碗面条");
                        //修改桌子上的食物状态
                        Desk.foodFlag = 1;
                        //叫醒等待的消费者开吃
                        Desk.Lock.notifyAll();
                    }
                }
            }
        }
    }*/
}
