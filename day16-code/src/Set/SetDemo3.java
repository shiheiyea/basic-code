package Set;

import java.util.HashSet;

public class SetDemo3 {
    public static void main(String[] args) {
        /* 需求: 创建一个存储学生对象的集合，存储多个学生对象。
            使用程序实现在控制台遍历该集合。
            要求:学生对象的成员变量值相同，我们就认为是同一个对象*/

        //1.创建三个学生对象
        Student1 s1 = new Student1("zhangsan", 23);
        Student1 s2 = new Student1("lisi", 24);
        Student1 s3 = new Student1("wangwu", 25);
        Student1 s4 = new Student1("zhangsan", 23);

        //2.创建集合用来添加学生
        HashSet<Student1> hs = new HashSet<>();

        //3.添加元素
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        //4.打印集合
        System.out.println(hs);

    }
}
