package mian_xiang_dui_xiang_xing_jie;

public class ArrayUtil {

    //私有化构造方法
    //目的：为了不让外界创建他的对象

    private ArrayUtil(){}

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sb.append("[").append(arr[i]);
            } else {
                sb.append(",").append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        return sum / arr.length;
    }
}
