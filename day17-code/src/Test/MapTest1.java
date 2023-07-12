package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        /*
        需求:创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        存储三个键值对元素，并遍历
        要求:同姓名，同年龄认为是同一个学生

        核心点:
            HashMap的键位置如果存储的是自定义对象，需要重写hashCode和equals方法。
        */

        //1.创建HashMap的对象
        HashMap<Student, String> hashMap = new HashMap<>();

        //2.创建三个学生对象
        Student stu1 = new Student("hieye", 19);
        Student stu2 = new Student("xiaohei", 16);
        Student stu3 = new Student("xiaobai", 3);
        Student stu4 = new Student("xiaobai", 3);

        //3.添加元素
        hashMap.put(stu1, "广州");
        hashMap.put(stu2, "日本");
        hashMap.put(stu3, "俄罗斯");
        hashMap.put(stu4, "广州");

        //遍历集合
        //hashMap.forEach((student, s) -> System.out.println(student + " " + s));
        Set<Student> set = hashMap.keySet();
        for (Student student : set) {
            String value = hashMap.get(student);
            System.out.println(student + "  " + value);
        }

        System.out.println("--------------------------");

        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
