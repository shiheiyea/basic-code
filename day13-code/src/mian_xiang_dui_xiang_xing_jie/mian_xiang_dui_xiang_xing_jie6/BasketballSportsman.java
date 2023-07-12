package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie6;

public class BasketballSportsman extends Sportsman{
    public BasketballSportsman() {
    }

    public BasketballSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学篮球");
    }
}
