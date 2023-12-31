package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            void write(int b)                                               一次写一个字节数据
            void write(byte[] b)                                            一次写一个字节数组数据
            void write(byte[] b, int off, int len)                          一次写一个字节数组的部分数据
            参数一:
                数组，
            参数二:
                起始索引
            参数三:
                个数
        */

        //1.创建对象
        FileOutputStream fos = new FileOutputStream("day21-code\\a.txt");

        //2.写出数据
        //fos.write(97); // a
        //fos.write(98); // b

        byte[] bytes = {97, 98, 99, 100, 101};

        //fos.write(bytes);
        fos.write(bytes, 1, 2);// b C

        //3.释放资源
        fos.close();


    }
}
