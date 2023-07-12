package Test.udpTest.udpTest4;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable {
    Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
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

        } catch (IOException e) {

            throw new RuntimeException(e);

        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
