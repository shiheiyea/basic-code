package Map;

import java.util.TreeMap;

public class MapDemo6 {
    public static void main(String[] args) {
        /*
        TreeMap集合:基本应用
            需求1:
                键:整数表示id
                值:字符串表示商品名称
            要求:按照id的升序排列、按照id的降序排列
        */

        //1.创建集合对象
        //Integer Double默认情况下都是按照升序排列的
        //String按照字母再ASCII码表中对应的数字升序进行排列
        //abcdefg...
        //o1:当前要添加的元素
        //o2:表示已经在红黑树中存在的元素
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1);
        //2.添加元素
        tm.put(5, "可恰可乐");
        tm.put(4, "雷碧");
        tm.put(3, "九个核桃");
        tm.put(2, "康帅傅");
        tm.put(1, "粤利粤");

        //3.打印集合
        System.out.println(tm);
    }
}
