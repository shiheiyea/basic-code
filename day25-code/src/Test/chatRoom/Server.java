package Test.chatRoom;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.*;

public class Server {
    static ArrayList<Socket> list = new ArrayList<>();

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("day25-code\\src\\Test\\chatRoom\\userinfo.txt");
        prop.load(fis);
        fis.close();

        ServerSocket ss = new ServerSocket(1000);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,                              //核心线程数量， 能小于0
                16,                                         //最大线程数，不能小于0，最大数量>=核心线程数量
                60,                                         //空闲线程最大存活时间
                TimeUnit.SECONDS,                           //时间单位
                new ArrayBlockingQueue<>(3),       //任务队列
                Executors.defaultThreadFactory(),           //创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()        //任务的拒绝策略
        );

        while (true) {
            Socket socket = ss.accept();
            MyRunnable runnable = new MyRunnable(socket, prop);
            pool.submit(runnable);
        }
    }
}
