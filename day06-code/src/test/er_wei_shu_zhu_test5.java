package test;

import java.util.Random;
import java.util.Scanner;

public class er_wei_shu_zhu_test5 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        // 选手的最后得分为: 去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        Random r = new Random();
        //int[] scoreArr = new int[6];
        int[] scoreArr = getScores();
        /*
        for (int i = 0; i < scoreArr.length; i++) {
            int ranndomIndex = r.nextInt(101);
            scoreArr[i] = ranndomIndex;
        }
        */
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        int avg = (sum - min - max) / (scoreArr.length - 2);
        System.out.println("选手的最终的得分为：" + avg);
    }
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (max < scoreArr[i]) {
                max = scoreArr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (min > scoreArr[i]) {
                min = scoreArr[i];
            }
        }
        return min;
    }
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }
    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入" + (i + 1) +"个评委的打分：");
            int score = sc.nextInt();
            if (0 <= score && score <= 100) {
                scores[i] = score;
                i++;
            }
            else {
                System.out.println("成绩超出范围，继续录入");
            }
        }
        return scores;
    }
}
