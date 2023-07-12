package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie6;

public class Test {
    public static void main(String[] args) {
        //创建运动员或教练的对象
        PingPangSportsman pps = new PingPangSportsman("刘诗雯",23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
