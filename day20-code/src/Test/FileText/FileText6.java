package Test.FileText;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileText6 {
    public static void main(String[] args) {
        /*
        需求:统计一个文件夹中每种文件的个数并打印。( 考虑子文件夹) .
        打印格式如下:
            txt:3个
            doc:4个
            jpg:6个
        */
        File file = new File("F:\\");
        HashMap<String, Integer> count = getCount(file);
        System.out.println(count);
    }

    /*
    *作用:
    *   统计一个文件夹中每种文件的个数
    *
    *参数:
    *   要统计的那个文件夹
    *
    *返回值:
    *   用来统计map集合
    *   键:后缀名   值:次数
    *
    *   a.txt
    *   a.a.txt
    *   aaa (不需要统计的)
    *
    */
    public static HashMap<String, Integer> getCount(File src) {
        File[] files = src.listFiles();
        HashMap<String, Integer> hm = new HashMap<>();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    String[] arr = name.split("\\.");
                    if (arr.length >= 2) {
                        String endName = arr[arr.length - 1];
                        if (hm.containsKey(endName)) {
                            //存在
                            int count = hm.get(endName);
                            count++;
                            hm.put(endName, count);
                        } else {
                            //不存在
                            hm.put(endName, 1);
                        }
                    }
                } else {
                    HashMap<String, Integer> sonMap = getCount(file);
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();
                        int value = entry.getValue();
                        if (hm.containsKey(key)) {
                            //存在添加覆盖
                            int count = hm.get(key);
                            count += value;
                            hm.put(key, count);
                        } else {
                            //不存在添加
                            hm.put(key, value);
                        }
                    }
                }
            }
        }
        return hm;
    }
}
