package Test.Test2;

public class MyThread extends Thread{
    static int gift = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (gift == 10) {
                    break;
                } else {
                    gift--;
                    System.out.println(getName() + ":礼物还剩下" + gift + "个");
                }
            }
        }
    }
}
