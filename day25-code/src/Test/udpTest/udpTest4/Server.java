package Test.udpTest.udpTest4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端:发送一条数据，接收服务端反馈的消息并打印
        //服务器:接收数据并打印，再给客户端反馈消息

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        //1.创建对象ServerSocker
        ServerSocket ss = new ServerSocket(1000);

        //2.监听客户端的链接
        while (true) {
            Socket socket = ss.accept();

            //new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
        }

    }
}
