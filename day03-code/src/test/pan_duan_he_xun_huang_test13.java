package test;

public class pan_duan_he_xun_huang_test13 {
    public static void main(String[] args) {
        /*
        在实际开发中，需要重复执行的代码，会选择循环实现。
        比如: 如左图所示。
        玩游戏的时候，如果网不好那么会经常断线重连那么断线重连这个业务逻辑就需要重复执行。
        假设现在公司要求，断线重连的业务逻辑最多只写5次。
        请用代码实现。
        备注: 断线重连的业务逻辑可以用输出语句替代。
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println("第" + i + "次执行断线重连的业务逻辑");
        }
    }
}
