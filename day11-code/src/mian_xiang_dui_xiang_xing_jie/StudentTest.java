package mian_xiang_dui_xiang_xing_jie;

public class StudentTest {
    /*
    总结:
            静态方法中没有this关键字
            静态方法中，只能访问静态。
            非静态方法可以访问所有
     */
    String name;
    int age;
    static String teacherName;

    //this:表示方法调用的地址值。
    //这个this：是由虚拟机赋值的。
    public void show1(StudentTest this) {
        System.out.println("this:" + this);
        System.out.println(name + ", " + age + ", " + teacherName);

        this.show2();
    }

    public void show2(){
        System.out.println("show2");
    }
    public static void method() {
        System.out.println("静态方法");
    }
}
