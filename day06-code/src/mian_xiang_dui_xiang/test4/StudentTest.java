package mian_xiang_dui_xiang.test4;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用空参构造
        Student s = new Student();

        Student S = new Student("zhangsan", 23);
        System.out.println(S.getName());
        System.out.println(S.getAge());
    }
}
