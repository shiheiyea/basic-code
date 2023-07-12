package Test.udpTest.udpTest2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端:发送一条数据，接收服务端反馈的消息并打印
        //服务器:接收数据并打印，再给客户端反馈消息

        //1.创建对象ServerSocker
        ServerSocket ss = new ServerSocket(1000);

        //2.监听客户端的链接
        Socket socket = ss.accept();

        //3.从连接通道中获取输入流读取数据
        //细节:
        //read方法会从连接通道中读取数据
        //但是，需要有一个结束标记，此处的循环才会停止
        //否则，程序就会一直停在read方法这里，等待读取下面的数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char) b);
        }

        String str = "有多高兴";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        //4.释放资源
        socket.close();
        ss.close();

    }
}
