package Test.Test1;

public class MyThread extends Thread{
    static int ticket = 0;
    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket == 100) {
                    break;
                } else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + "在打印第" + ticket + "张票");
                }
            }
        }
    }
}
