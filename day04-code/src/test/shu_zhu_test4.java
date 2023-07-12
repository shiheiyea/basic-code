package test;

public class shu_zhu_test4 {
    public static void main(String[] args) {
        //定义数组求最大值: 33,5,22,44,55
        //扩展问题:
        //1.根据求最大值的思路，自己改写一下求最小值
        //2.为什么max要记录为arr[0],默认值不能为0吗?
        //不能写0怕出现负数
        //max的初始化值一定要是数组中的值。
        //3.循环中开始条件一定是0吗?
        //循环的开始条件如果为0，那么第一次循环的时候是自己跟自己比了一下，对结果没有任何影响，但是效率偏低
        //为了提高效率，减少一次循环的次数，循环开始条件可以写1.
        int[] arr = {33,5,22,44,55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
