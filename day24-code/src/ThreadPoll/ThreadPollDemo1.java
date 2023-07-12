package ThreadPoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPollDemo1 {
    public static void main(String[] args) {
        /*
        public static ExecutorService newCachedThreadPool()            创建一一个没有 上限的线程池
        public static ExecutorService newF ixedThreadPool (int nThreads)创建有上限的线程池
        */

        //1.获取线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //2.提交任务
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        //3.销毁线程池
        //poo11. shutdown();

    }
}
