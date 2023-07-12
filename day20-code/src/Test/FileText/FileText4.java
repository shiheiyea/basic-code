package Test.FileText;

import java.io.File;

public class FileText4 {
    public static void main(String[] args) {
        /*
        删除一个多级文件夹
        如果我们要删除一个有内容的文件夹
        1.先删除文件夹里面所有的内容
        2.再删除自己
        */
        File file = new File("F:\\temp\\aaa");
        delte(file);
    }
    /*
    作用:删除src文件夹
    参数:要删除的文件夹
    */
    public static void delte(File src) {
        File[] files = src.listFiles();
        if (files!= null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    delte(file);
                }
            }
            //删除自己
            src.delete();
        }
    }
}
