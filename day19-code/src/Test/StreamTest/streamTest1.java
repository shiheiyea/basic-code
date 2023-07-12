package Test.StreamTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class streamTest1 {
    public static void main(String[] args) {
        /*定义一个集合，并添加一些整数1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        过滤奇数，只留下偶数。
        并将结果保存起来*/
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = list1.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
