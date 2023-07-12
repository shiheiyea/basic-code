package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie8;

public class Test {
    public static void main(String[] args) {
        {
            int a = 10;
        }//因为当代码执行到这里时，变量a就从内存中消失了
        //System.out.println(a);

        Student s1 = new Student();

        Student s2 = new Student("heiye",18);

        Student s3 = new Student("heiye");
    }
}
