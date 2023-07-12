package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie9;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        SharPei sp = new SharPei();
        ChineseDog cd = new ChineseDog();
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();
        System.out.println("===================");
        sp.eat();
        sp.drink();
        sp.lookHome();
        System.out.println("===================");
        cd.eat();
        cd.drink();
        cd.lookHome();
    }
}
