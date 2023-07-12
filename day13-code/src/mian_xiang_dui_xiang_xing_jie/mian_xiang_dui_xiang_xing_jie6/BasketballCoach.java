package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie6;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教学生打篮球");
    }
}
