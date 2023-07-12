package mian_xiang_dui_xiang_xing_jie;

public class mian_xiang_dui_xiang_xing_jie3 {
    public static void main(String[] args) {
        StudentTest.teacherName = "黑夜";

        StudentTest s1 = new StudentTest();
        System.out.println("s1:" + s1);
        s1.name = "zhangsan";
        s1.age = 23;
        s1.show1();

        System.out.println("===================");

        StudentTest s2 = new StudentTest();
        System.out.println("s2:" + s2);
        s2.name = "lisi";
        s2.age = 24;
        s2.show1();
    }
}
