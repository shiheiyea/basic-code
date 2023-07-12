package test;

import java.util.Random;
import java.util.Scanner;

public class er_wei_shu_zhu_test11 {
    public static void main(String[] args) {
        //双色球系统
        //投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1-33中选择;蓝色球号码从1-16中选择
        int[] arr = createNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        int[] userInputArr = userInputNumber();
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int i1 = 0; i1 < userInputArr.length - 1; i1++) {
                if (arr[i] == userInputArr[i1]) {
                    redCount++;
                }
            }
        }
        if (arr[arr.length - 1] != userInputArr[userInputArr.length - 1]) {
            blueCount++;
        }
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万");
        }
        else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500万");
        }
        else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000");
        }
        else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200");
        }
        else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200");
        }
        else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200");
        }
    }
    public static int[] createNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6;) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }
    public static int[] userInputNumber(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6;)  {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (1 <= redNumber && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (flag) {
                    arr[i] = redNumber;
                    i++;
                }
                else {
                    System.out.println("当前的红色号码已存在，请重新输入：");
                }
            }
            else {
                System.out.println("当前的红色号码超出范围");
            }
        }
        while (true) {
            System.out.println("请输入蓝球的号码：");
            int blueNumber = sc.nextInt();
            if (1 <= blueNumber && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            }
            else {
                System.out.println("当前的蓝色号码超出范围");
            }
        }
        return arr;
    }
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return false;
            }
        }
        return true;
    }
}
