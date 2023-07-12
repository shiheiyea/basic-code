package Thread;

public class MyThread extends Thread {

    //表示这个类所有的对象，都共享ticket数据
    //static int ticket = 0;//0~99

    //static Lock lock = new ReentrantLock();

    //锁对象，一定要是唯一的
    //static Object obj = new Object();

    static Object objA = new Object();
    static Object objB = new Object();

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //书写线程要执行代码
        /*for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": HelloWorld");
        }*/

        /*for (int i = 0; i < 100; i++) {
         *//*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*//*
            System.out.println(getName() + "@" + i);

            //表示让出CPU的执行权
            Thread.yield();
        }*/


        /*while (true) {
            //同步代码块
            //synchronized (MyThread.class) {
            lock.lock();
            try {
                Thread.sleep(10);
                if (ticket < 100) {
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票! ! ! ");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }*/

        //}

        //1.循环
        while (true) {
            if ("线程A".equals(getName())) {
                synchronized (objA) {
                    System.out.println("线程A拿到了A锁，准备拿B锁");
                    synchronized (objB) {
                        System.out.println("线程A拿到了B锁，顺利执行完一轮");
                    }
                }
            } else if ("线程B".equals(getName())) {
                if ("线程B".equals(getName())) {
                    synchronized (objB) {
                        System.out.println("线程B拿到了B锁，准备拿A锁");
                        synchronized (objA) {
                            System.out.println("线程B拿到了A锁，顺利执行完一轮");
                        }
                    }
                }
            }

        }
    }
}
