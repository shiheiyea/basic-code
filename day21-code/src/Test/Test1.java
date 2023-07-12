package Test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹

        //1.创建对象表示数据源
        File src = new File("F:\\temp\\src");

        //2.创建对象表示目的地.
        File dest = new File("F:\\temp\\dest");

        copydir(src, dest);


    }

    /*
     *作用:拷贝文件夹
     *参数一:数据源
     *参数二:目的地
     **/
    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        //递归
        //1.进入数据源.
        File[] files = src.listFiles();
        //2.遍历数组
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    //3.判断文件，拷贝
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));

                    byte[] bytes = new byte[1024 * 1024 * 5];
                    int len;
                    while ((len = fis.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }
                    fis.close();
                    fos.close();
                } else {
                    copydir(file, new File(dest, file.getName()));
                }
            }
        }
    }
}
