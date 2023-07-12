package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        /*
        练习:
        文件拷贝
        把E:\BGM\3257518994.mp3找贝到当前模块下。
        注意:
        选择一个比较小的文件，不要太大。大文件拷贝我们下一一个视频会说。，


        课堂练习:
        要求统计一下拷贝时间，单位毫秒
        **/
        //1.创建对象
        FileInputStream fis = new FileInputStream("E:\\BGM\\3257518994.mp3");
        FileOutputStream fos = new FileOutputStream("day21-code\\copy.mp3");

        //2.拷贝
        //核心思想:边读边写
        long start = System.currentTimeMillis();
        //int b;
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        //while ((b = fis.read()) != -1) {
        while ((len = fis.read(bytes)) != -1) {
            //fos.write(b);
            fos.write(bytes, 0, len);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
        //3.释放资源
        //规则:先开的最后关闭
        fos.close();
        fis.close();

    }
}
