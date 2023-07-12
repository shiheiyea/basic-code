package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie4;

public class Test {
    public static void main(String[] args) {

        Rafdoll rd = new Rafdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("==================");

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
    }
}
