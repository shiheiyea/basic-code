package ji_he;

import java.util.ArrayList;

public class ji_he6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("xiaoming",24);
        Student s3 = new Student("lihua",25);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
