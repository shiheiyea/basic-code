package Map;

import java.util.LinkedHashMap;

public class MapDemo5 {
    public static void main(String[] args) {
        /*
            LinkedHashMap:
                由键决定:
                    有序、不重复、无索引。
                有序:
                    保证存储和取出的顺序一致
                原理:
                    底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序。
        */
        //1.创建集合
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        //添加元素
        lhm.put("a", 123);
        lhm.put("b", 547);
        lhm.put("c", 222);
        lhm.put("b", 234);

        System.out.println(lhm);
    }
}
