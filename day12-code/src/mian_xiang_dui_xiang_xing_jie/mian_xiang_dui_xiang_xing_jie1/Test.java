package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie1;

import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);

        Teacher t = new Teacher();
        t.setName("小王");
        t.setAge(29);

        Administrator a = new Administrator();
        a.setName("黑夜");
        a.setAge(18);

        register(s);
        register(t);
        register(a);
    }

    public static void register(Person p) {
        p.show();
    }
}
