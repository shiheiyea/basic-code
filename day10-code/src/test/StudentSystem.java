package test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("------------欢迎来到学生管理系统------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    System.exit(0);//停止虚拟机运行
                    //break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    public static void addStudent(ArrayList<Student> list){
        System.out.println("添加学生");
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的id:");
            stu.setId(sc.next());
            int count = contains(list,stu);
            if (count != -1) {
                System.out.println("该学生id已存在，请重新输入");
            }
            else {
                break;
            }
        }
        System.out.println("请输入学生的姓名：");
        stu.setName(sc.next());
        System.out.println("请输入学生的年龄：");
        stu.setAge(sc.nextInt());
        System.out.println("请输入学生的家庭住址：");
        stu.setAddress(sc.next());
        list.add(stu);
        System.out.println("学生信息添加成功");
     }
    public static void deleteStudent(ArrayList<Student> list)  {
        System.out.println("删除学生");
        System.out.println("请输入需要删除的学生的id：");
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        stu.setId(sc.next());
        int count = contains(list,stu);
        if (count != -1) {
            list.remove(count);
            System.out.println("id：" + stu.getId() + "删除成功");
        }
        else {
            System.out.println("id不存在，删除失败");
        }
    }
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("修改学生");
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的id:");
        stu.setId(sc.next());
        int count = contains(list,stu);
        if (count == -1) {
            System.out.println("该学生id不存在");
            return;
        }
        stu = list.get(count);
        System.out.println("请输入要修改学生的姓名：");
        stu.setName(sc.next());
        System.out.println("请输入要修改学生的年龄：");
        stu.setAge(sc.nextInt());
        System.out.println("请输入要修改学生的家庭住址：");
        stu.setAddress(sc.next());
        System.out.println("修改成功");
    }
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("查询学生");
        Scanner sc = new Scanner(System.in);
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.Address());
        }
    }
    public static int contains(ArrayList<Student> list, Student stu) {
        for (int i = 0; i < list.size(); i++) {
            Student sid = list.get(i);
            if (sid.getId().equals(stu.getId())) {
                return i;
            }
        }
        return -1;
    }
}
