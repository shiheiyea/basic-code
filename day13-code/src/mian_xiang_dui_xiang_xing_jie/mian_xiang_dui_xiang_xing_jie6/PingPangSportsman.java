package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie6;

public class PingPangSportsman extends Sportsman implements English{
    public PingPangSportsman() {
    }

    public PingPangSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void study() {
        System.out.println("学习乒乓球");
    }
}
