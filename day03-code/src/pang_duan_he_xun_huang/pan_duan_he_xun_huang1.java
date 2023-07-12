package pang_duan_he_xun_huang;

import java.util.Scanner;

public class pan_duan_he_xun_huang1
{
    public static void main(String[] args)
    {
        //需求: 键盘录入女婿酒量，如果大于 2 斤，老丈人给出回应，反之不回应
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        int wine = sc.nextInt();
        if (wine > 2)
        {
            System.out.println("诶呦，小伙子不错哦~");
        }

    }
}
