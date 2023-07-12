package API.Test.MathTest;

public class MathTest2 {
    public static void main(String[] args) {
        //一共有多少个水仙花数。
        //判断一下为什么没有两位子幂数
        //判断一共多少个四叶玫瑰数， 五角星数

        //两位子幂： 10 ~ 99         0
        //水仙花数： 100 ~ 999       4
        //四叶玫瑰： 1000 ~ 9999     3
        //五角星：   10000 ~ 99999   3
        int count = 0;
        for (int i = 10; i < 99; i++) {
            int ge = i % 10;
            int shi = i /10 % 10;
            //int bai = i / 100 % 10;
            //int thousand = i / 1000 % 10;
            //int million = i / 10000 % 10;

            double sum = Math.pow(ge, 2) + Math.pow(shi, 2) ;
            //+ Math.pow(bai, 5) + Math.pow(thousand, 5) + Math.pow(million, 5)
            if (i == sum) {
                count++;
                //System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
