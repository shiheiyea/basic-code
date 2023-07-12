package API.Objects;

import API.Object.Student;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        /*
        public static boolean equals(Object a, object b)        先做非空判断，比较两个对象
        public static boolean isNu1l(Object obj)                判断对象是否为null，为null返回true , 反之
        public static boolean nonNu1l(object obj )              判断对象是否为null，跟isNull的结果相反
        */

        //1.创建学生类的对象
        //Student s1 = new Student("zhangsan" , 23);
        Student s1 = null;
        Student s2 = new Student(" zhangsan", 23) ;

        //2.比较两个对象的属性值是否相同
        /*if (s1 != null) {
            boolean result = s1.equals(s2);
            System.out.println(result);
        } else {
            System.out.println("调用者为空");
        }*/

        boolean result = Objects.equals(s1,s2);
        System.out.println(result);

        //细节:
        //1.方法的底层会判断s1是否为nul1，如果为nu1l，直接返回false
        //2.如果s1不为nu1l，那么就利用s1再次调用equals方法
        //3.此时s1是Student类型，所以最终还是会调用Student中的equals方法.
        //如果没有重写，比较地址值，如果重写了，就比较属性值。


        //public static boolean isNull(Object obj)      判断对象是否为null,为nu11返回true,反之
        Student s3 = new Student();
        Student s4 = null;

        System.out.println(Objects.isNull(s3));//false
        System.out.println(Objects.isNull(s4));//true

        System.out.println(Objects.nonNull(s3));//true
        System.out.println(Objects.nonNull(s4));//false
    }
}
