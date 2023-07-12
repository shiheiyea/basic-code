package mian_xiang_dui_xiang_xing_jie;

public class mian_xiang_dui_xiang_xing_jie1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student.teacherName = "黑夜";
        s1.setName("张三");
        s1.setAge(24);
        s1.setGender("男");
        //s1.teacherName = "黑夜";

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(25);
        s2.setGender("女");
        //s2.teacherName = "黑夜";

        s2.study();
        s2.show();
    }
}