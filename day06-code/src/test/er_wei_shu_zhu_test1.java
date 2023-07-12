package test;

import java.util.Scanner;

public class er_wei_shu_zhu_test1 {
    public static void main(String[] args) {
        /*
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格: 旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int ticket = sc.nextInt();
        System.out.println("请输入飞机起飞月份：");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 为头等舱，1为经济舱：");
        int seat = sc.nextInt();
        if (5 <= month && month <= 10) {
            //ticket = getprice(ticket,seat,0.9,0.85);
            ticket = getTicket(ticket, seat, 0.9, 0.58);
        }
        else if ((1 <= month && month <= 4) || (6 <= month && month <= 12)){
            //ticket = getprice(ticket,seat,0.7,0.65);
            ticket = getTicket(ticket, seat, 0.7, 0.65);
        }
        else {
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println(ticket);
    }

    private static int getTicket(int ticket, int seat, double v, double v2) {
        if (seat == 0) {
            ticket = (int) (ticket * v);
        } else if (seat == 1) {
            ticket = (int) (ticket * v2);
        } else {
            System.out.println("键盘录入的舱位不合法");
        }
        return ticket;
    }

    /*public static int getprice(int ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = (int)(ticket * v0);
        }
        else if (seat == 1){
            ticket = (int)(ticket * v1);
        }
        else {
            System.out.println("键盘录入的舱位不合法");
        }
        return ticket;*/
}
