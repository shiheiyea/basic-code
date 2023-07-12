package Test;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是(A、B、C、D) ,
            每个学生只能选择一一个景点， 请统计出最终哪个景点想去的人数最多。
        */

        //1.需要先让同学们投票
        //定义一一个数组，存储4个景点
        String arr[] = {"A", "B", "C", "D"};
        ArrayList<String> arrayList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            arrayList.add(arr[index]);
        }

        //2.如果要统计的东西比较多，不方便使用计数器思想
        //我们可以定义map集合，利用集合进行统计。
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String key : arrayList) {
            //判断当前的景点在map集合当中是否存在
            if (hashMap.containsKey(key)) {
                //存在
                //先获取当前景点已经被投票的次数
                Integer count = hashMap.get(key);
                //表示当前景点又被投了一次
                count++;
                //把新的次数再次添加到集合当中
                hashMap.put(key, count);
            } else {
                //不存在
                hashMap.put(key, 1);
            }
        }

        //求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }

        //4.判断哪个景点的次数跟最大值一一样，如果一样，打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println(hashMap);
    }
}
