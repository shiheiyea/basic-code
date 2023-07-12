package Test.udpTest.udpTest3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端:发送一条数据，接收服务端反馈的消息并打印
        //服务器:接收数据并打印，再给客户端反馈消息


        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1", 1000);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day25-code\\src\\clientdir\\a.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
            bos.flush();
        }

        //写出一个结束标记
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);

        //3.释放资源
        bis.close();
        socket.close();
    }
}
