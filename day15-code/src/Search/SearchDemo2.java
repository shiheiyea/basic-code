package Search;

import java.util.ArrayList;

public class SearchDemo2 {
    public static void main(String[] args) {
        //课堂练习1:
        //需求:定义一一个方法利用基本查找，查询某个元素在数组中的索引
        //要求:不需要考虑数组中元素是否重复

        //课堂练习2:
        //需求:定义一一个方法利用基本查找，查询某个元素在数组中的索引
        //要求:需要考虑数组中元素有再复的可能性

        //{131, 127, 147, 81, 103, 23, 7, 79, 81}
        //我要查找81，想要返回的是所有索引3
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int number = 81;
        //System.out.println(basicSearch(arr, number));
        ArrayList<Integer> list = basicSearch(arr, number);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    //参数:
    //一:数组
    //二:要查找的元素

    //返回值:
    //元素是否存在
    public static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        //利用基本查找来查找number在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
