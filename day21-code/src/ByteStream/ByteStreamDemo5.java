package ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        /*
            字节输入流循环读取
        */

        //1.创建对象
        FileInputStream fis = new FileInputStream("day21-code\\a.txt");


        //read :表示读取数据，而且是读取一个数据就移动一次指针

        //2.循环读取
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }

        //3.释放资源
        fis.close();

    }
}
