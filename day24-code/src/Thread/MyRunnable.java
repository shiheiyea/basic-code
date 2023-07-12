package Thread;

public class MyRunnable implements Runnable {
    int ticket = 0;


    @Override
    public void run() {
        /*for (int i = 0; i < 100; i++) {
            //获取到当前线程的对象
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }*/

        //1.循环
        while (true) {
            //2.同步代码块(同步方法)
            if (method()) break;
        }
    }

    //this
    private synchronized boolean method() {
        //3.判断共享数据是否到了末尾，如果到了末尾
        if (ticket == 100) {
            return true;
        } else {
            //4.判断共享数据是否到了末尾，如果没有到末尾
            ticket++;
            System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票! ! ! ");
        }
        return false;
    }
}
