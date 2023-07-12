package mian_xiang_dui_xiang_xing_jie;


import java.util.ArrayList;

public class StudentUtil {

    private StudentUtil(){}

    public static int getMaxAgeStudent(ArrayList<Student> list) {
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getAge() > max) {
                max = stu.getAge() ;
            }
        }
        return max;
    }
}
