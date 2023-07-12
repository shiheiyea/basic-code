package sun_huang_gao_ji_zhong_he_liang_xi;

public class sun_huang_gao_ji_zhong_he_liang_xi2 {
    public static void main(String[] args) {
        //1.跳过某一次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
                //结束本次循环，继续下次循环。
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
        //2.结束整个循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if (i == 3) {
                //结束整个循环
                break;
            }
        }
    }
}
