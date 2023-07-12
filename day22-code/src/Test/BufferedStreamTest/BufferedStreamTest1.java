package Test.BufferedStreamTest;

import java.io.*;

public class BufferedStreamTest1 {
    public static void main(String[] args) throws IOException {
        /*
            四种方式拷贝文件，并统计各自用时
        */

        long start = System.currentTimeMillis();
        method1();
        //method2();    10.647秒
        //method3();    63.844秒
        //method4();    10.715秒
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + "秒");
    }

    private static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\temp\\aaa\\芜!.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\temp\\dest\\芜!.mp4"));


        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bis.close();
        bos.close();
    }

    private static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\temp\\aaa\\芜!.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\temp\\dest\\芜!.mp4"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bis.close();
        bos.close();
    }

    private static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\temp\\aaa\\芜!.mp4");
        FileOutputStream fos = new FileOutputStream("F:\\temp\\dest\\芜!.mp4");

        byte[] bytes = new byte[8192];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fis.close();
        fos.close();
    }

    private static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\temp\\aaa\\芜!.mp4");
        FileOutputStream fos = new FileOutputStream("F:\\temp\\dest\\芜!.mp4");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fis.close();
        fos.close();
    }
}
