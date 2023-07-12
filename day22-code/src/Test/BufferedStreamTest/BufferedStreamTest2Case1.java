package Test.BufferedStreamTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BufferedStreamTest2Case1 {
    public static void main(String[] args) throws IOException {
        /*
            需求:把《出师表》的文章顺序进行恢复到一一个新文件中。
        */

        //读取数据
        BufferedReader br = new BufferedReader(new FileReader("day22-code\\csb.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        //排序
        //排序规则:按照每一行前面的序号进行排列
        Collections.sort(list,
                //获取o1和o2的序号
                (o1, o2) -> Integer.parseInt(o1.split("\\.")[0])
                            -
                            Integer.parseInt(o2.split("\\.")[0]));

        //写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("day22-code\\sort.txt"));
        for (String str : list) {
            //bw.write(s.substring(2, s.length() - 1));
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
}
