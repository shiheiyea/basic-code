package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo8 {
    public static void main(String[] args) {

        //利用try... catch...finally捕获拷贝文件中代码出现的异常

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.创建对象
            fis = new FileInputStream("E:\\BGM\\3257518994.mp3");
            fos = new FileOutputStream("day21-code\\copy.mp3");
            //2.拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //3.释放资源
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
