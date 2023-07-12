package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        班级里有5个学生
        要求:
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
        */

        //1.定义集合
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰 ", "袁明媛");
        //3.随机点名
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            System.out.println("--------------第" + i + "次-------------");
            while (!list1.isEmpty()) {
                int index = r.nextInt(list1.size());
                String name = list1.get(index);
                list1.remove(name);
                list2.add(name);
                System.out.println(name);
            }
            list1.addAll(list2);
            list2.clear();
        }
    }
}
