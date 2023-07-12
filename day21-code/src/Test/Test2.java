package Test;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        加密原理:
            对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
        解密原理:
            读取加密之后的文件，按照加密的规则反向操作，变成原始文件。

        ^:异或
            两边相同: false
            两边不同: true

            0: false
            1: true

        100: 1100100
         10: 1010

            1100100
        ^   0001010
        ___________
            1101110

        十进制: 110

       */

        /*FileInputStream fir = new FileInputStream("day21-code\\girl.jpg");
        FileOutputStream fos = new FileOutputStream("day21-code\\ency.jpg");*/
        FileInputStream fir = new FileInputStream("day21-code\\ency.jpg");
        FileOutputStream fos = new FileOutputStream("day21-code\\redu.jpg");

        int b;
        while ((b = fir.read()) != -1) {
            fos.write(b ^ 10);
        }

        fir.close();
        fos.close();

    }
}
