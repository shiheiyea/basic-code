package CharSet;

import java.io.FileInputStream;
import java.io.IOException;

public class CharSetDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            字节流读取中文会出现乱码
        */
        FileInputStream fis = new FileInputStream("day21-code\\a.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();

    }
}
