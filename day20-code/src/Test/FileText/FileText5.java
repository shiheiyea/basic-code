package Test.FileText;

import java.io.File;

public class FileText5 {
    public static void main(String[] args) {
        /*
        需求:
            统计一个文件夹的总人小
        */
        File file = new File("F:\\temp\\aaa");
        System.out.println(getLen(file));
    }

    /*
     *作用:
     *统计一个文件夹的总大小
     *参数:
     *   表示要统计的那个文件夹
     *
     *返回值:
     *   统计之后的结果
     *
     *文件夹的总大小:
     *   说白了，文件夹里面所有文件的大小
     **/
    public static long getLen(File src) {
        File[] files = src.listFiles();
        long len = 0;
        for (File file : files) {

            if (file.isFile()) {

                len += file.length();

            } else {

                len += getLen(file);

            }
        }

        return len;
    }
}
