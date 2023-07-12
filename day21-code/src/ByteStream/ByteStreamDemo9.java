package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo9 {
    public static void main(String[] args) {
        /*
        注意:只有实现了AutoCloseable接口的类，才能在小括号中创建对象。

        JDK 7:
        try(){

        }catch(){

        }*/

        try (FileInputStream fis = new FileInputStream("E:\\BGM\\3257518994.mp3");
             FileOutputStream fos = new FileOutputStream("day21-code\\copy.mp3")) {
            //2.拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
