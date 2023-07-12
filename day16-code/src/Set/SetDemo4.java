package Set;

import java.util.LinkedHashSet;

public class SetDemo4 {
    public static void main(String[] args) {
        //1.创建4个学生对象
        Student1 s1 = new Student1("zhangsan", 23);
        Student1 s2 = new Student1("lisi", 24);
        Student1 s3 = new Student1("wangwu", 25);
        Student1 s4 = new Student1("zhangsan", 23);

        //2.创建集合的对象
        LinkedHashSet<Student1> lhs = new LinkedHashSet<>();

        //3.添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        //打印集合
        System.out.println(lhs);
    }
}
