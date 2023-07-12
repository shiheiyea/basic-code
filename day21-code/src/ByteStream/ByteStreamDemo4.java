package ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
            /*
            演示:字节输入流FileInputStream
            实现需求:读取文件中的数据。 (暂时不写中文)

            实现步骤:
                    创建对象
                        细节1:如果文件不存在，就直接报错。
                        Java为什么会这么设计呢?
                        输出流:不存在，创建
                            把数据写到文件当中

                        输入流:不存在，而是报错呢?
                            因为创建出来的文件是没有数据的，没有任何意义。
                            所以Java就没有设计这种无意义的逻辑，文件不存在直接报错。

                        程序中最重要的是:数据。

                    读取数据
                        细节1:一次读一个字节，读出来的是数据在ASCII上对应的数字
                        细节2:读到文件末尾了，read方法返回-1。

                    释放资源
                        细节:每次使用完流之后都要释放资源
            **/
        FileInputStream fis = new FileInputStream("day21-code\\a.txt");

        int b1 = fis.read();
        System.out.println((char) b1);

        int b2 = fis.read();
        System.out.println((char)b2);

        int b3 = fis.read();
        System.out.println((char)b3);

        int b4 = fis.read();
        System.out.println((char)b4);

        int b5 = fis.read();
        System.out.println(b5);


        fis.close();
    }
}
