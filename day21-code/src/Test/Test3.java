package Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据:
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据:
                1-2-4-7-8-9
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
        String str = sb.toString();
        String[] arrStr = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list);

        //写出
        FileWriter fw = new FileWriter("day21-code\\a.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                fw.write(list.get(i) + "");
            } else {
                fw.write("-" + list.get(i));
            }
        }

        fw.close();



    }
}
