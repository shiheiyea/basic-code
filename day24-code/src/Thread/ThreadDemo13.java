package Thread;

public class ThreadDemo13 {
    public static void main(String[] args) {
        /*
         * 需求:完成生产者和消费者(等待唤醒机制)的代码
         *          实现线程轮流交替执行的效果
         *
         */


        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程A");
        t2.setName("线程B");

        t1.start();
        t2.start();
    }
}
