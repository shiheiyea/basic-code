package Test.udpTest.udpTest2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端:发送一条数据，接收服务端反馈的消息并打印
        //服务器:接收数据并打印，再给客户端反馈消息


        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1", 1000);

        OutputStream os = socket.getOutputStream();

        String str = "很高兴遇到你";
        os.write(str.getBytes());

        //写出一个结束标记
        socket.shutdownOutput();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char) b);
        }

        //3.释放资源
        os.close();
        socket.close();
    }
}
