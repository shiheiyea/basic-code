package Lambda;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*
        定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        要求:
            按照字符串的长度进行排序，短的在前面，长的在后面。
            (暂时不比较字符串里面的内容)
        */

        String[] arr = {"a", "aaaa", "aaa", "aa"};

        //如果以后我们要把数组中的数据按照指定的方式进行排列，就需要用到sort方法，而且要指定排序的规则
        /*
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1，String o2) {
                //字符串的长度进行排序
                return o1.length() - o2.length();
            }
       });

        //Lambda完整格式
        Arrays.sort(arr, (String 01，String 02)-> {
                return o1.length() - o2.length();
            }
        );*/

        //Lambda简写格式
        //小括号:数据类型可以省略，如果参数只有一个，小括号还可以省略
        //大括号:如果方法体只有一行，return, 分号，大括号都可以省略

        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
