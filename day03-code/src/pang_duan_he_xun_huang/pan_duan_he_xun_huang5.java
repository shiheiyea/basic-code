package pang_duan_he_xun_huang;

public class pan_duan_he_xun_huang5 {
    public static void main(String[] args) {
        /*
        switch新特性
           JDK12
        */
        //需求:
        //1 2 3 一 二 三
        /*
        switch和if第三种格式各自的使用场景
        if的第三种格式:一般用于对范围的判断
        switch: 把有限个数据一一列举出来，让我们任选其一
        */
        /*
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这种选项");
                break;
         */
        int number = 10;
        switch (number){
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }
    }
}
