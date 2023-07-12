package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie16;

public class Test2 {


    //没有名字的成员内部类
    Swim s = new Swim() {

        @Override
        public void swim() {
            System.out.println("重写了游泳的方法");
        }
    };

    public static void main(String[] args) {
        Swim s = new Swim() {

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        s.swim();

        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        }.swim();
    }
}
