package Test.BufferedStreamTest;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BufferedStreamTest2Case2 {
    public static void main(String[] args) throws IOException {
        /*
            需求:把《出师表》的文章顺序进行恢复到一一个新文件中。
        */

        //读取数据
        BufferedReader br = new BufferedReader(new FileReader("day22-code\\csb.txt"));
        String line;
        TreeMap<Integer, String> tm = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            //0:序号 1:内容
            //tm.put(Integer.parseInt(arr[0]), arr[1]);
            tm.put(Integer.parseInt(arr[0]), line);
        }
        br.close();

        //写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("day22-code\\sort2.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
