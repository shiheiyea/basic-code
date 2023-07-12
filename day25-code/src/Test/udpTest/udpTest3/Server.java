package Test.udpTest.udpTest3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端:发送一条数据，接收服务端反馈的消息并打印
        //服务器:接收数据并打印，再给客户端反馈消息

        //1.创建对象ServerSocker
        ServerSocket ss = new ServerSocket(1000);

        //2.监听客户端的链接
        Socket socket = ss.accept();

        BufferedInputStream isr = new BufferedInputStream(socket.getInputStream());
        String name = UUID.randomUUID().toString().replace("-", "");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day25-code\\src\\serverdir\\" + name+ ".jpg"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = isr.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
            bos.flush();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str = "上传成功";
        bw.write(str);
        bw.flush();

        //4.释放资源
        //bw.close();
        bos.close();
        socket.close();
        ss.close();

    }
}
