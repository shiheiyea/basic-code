package test;

import java.util.Random;

public class er_wei_shu_zhu_test9 {
    public static void main(String[] args) {
        /*
         需求:
        一个大V直播抽奖，奖品是现金红包，分别有{2，588 ，888，1000，10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下:(随机顺序，不一定是下面的顺序)
            888元的奖金被抽出
            588元的奖金被抽出
            10000元的奖金被抽出
            1000元的奖金被抽出
            2元的奖金被抽出
         */
        Random r = new Random();
        int[] arr = {2,588,888,1000,10000};
        int[] newArr = new int[arr.length];
        int count = 0;
        while (count != arr.length) {
            int randomIndex = r.nextInt(arr.length);
            boolean flag = contains(newArr, arr[randomIndex]);
            if (flag) {
                newArr[count] = arr[randomIndex];
                System.out.println(newArr[count] + "元的奖金被抽出");
                count++;
            }
        }
    }
    public static boolean contains(int[] newArr, int prize) {
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == prize) {
                return false;
            }
        }
        return true;
    }
}
