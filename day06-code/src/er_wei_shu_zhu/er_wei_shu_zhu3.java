package er_wei_shu_zhu;

public class er_wei_shu_zhu3 {
    public static void main(String[] args) {
        int[][] yearArrArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int yearSum = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int sum = getSum(yearArrArr[i]);
            System.out.println("第" + (i + 1) + "个季度的总营业额为：" + sum);
            yearSum += sum;
        }
        System.out.println("全年的总营业额为：" + yearSum);
        /*int sum = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            for (int j = 0; j < yearArrArr[i].length; j++) {
                sum += yearArrArr[i][j];
            }
        }*/
    }
    public  static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
