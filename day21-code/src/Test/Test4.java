package Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) throws IOException {
         /*
            文本文件中有以下的数据:
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据:
                1-2-4-7-8-9

            细节1:
                文件中的数据不要换行


            细节2:
                bom头

        */

        //1.读取数据
        FileReader fr = new FileReader("day21-code\\a.txt");
        StringBuilder sb = new StringBuilder();

        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }

        fr.close();

        //排序
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        //写出
        String str = Arrays.toString(arr).replace(", ", "-");

        String result = str.substring(1, str.length() - 1);

        FileWriter fw = new FileWriter("day21-code\\a.txt");

        fw.write(result);

        fw.close();
    }
}
