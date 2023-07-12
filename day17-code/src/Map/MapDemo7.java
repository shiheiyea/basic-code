package Map;

import java.util.TreeMap;

public class MapDemo7 {
    public static void main(String[] args) {
        /*
        TreeMap集合:基本应用
            需求2:
                键:学生对象
                值:籍贯
                要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
        */

        //1.创建集合
        TreeMap<Student, String> tm = new TreeMap<>();

        //2.创建三个学生对象
        Student s1 = new Student(" zhangsan", 18);
        Student s2 = new Student("heiye", 19);
        Student s3 = new Student("xiaobai", 23);

        //3.添加元素
        tm.put(s1, "广州");
        tm.put(s2, "佛山");
        tm.put(s3, "广州");

        System.out.println(tm);

    }
}
