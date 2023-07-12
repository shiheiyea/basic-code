package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         *演示:字节输出流FileOutputStream
         *实现需求:写出一段文字到本地文件中。 (暂时不写中文)
         *
         *
         *实现步骤:
         *        创建对象
         *              细节1:参数是字符串表示的路径或者是File对象都是可以的
         *              细节2:如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
         *              细节3:如果文件已经存在，则会清空文件
         *        写出数据
         *              细节: write 方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符
         *              "9"
         *              "7"
         *        释放资源
         *              每次使用完流之后都要释放资源
         * */

        //1.创建对象
        //写出输出流OutputStream
        //本地文件  File
        FileOutputStream fos = new FileOutputStream("day21-code\\a.txt");
        //2.写出数据
        fos.write(97);
        //3.释放资源
        fos.close();

    }
}
