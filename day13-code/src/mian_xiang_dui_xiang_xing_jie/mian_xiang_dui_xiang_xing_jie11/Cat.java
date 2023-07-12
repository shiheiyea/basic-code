package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie11;

public class Cat {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }
    class Engine{
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
