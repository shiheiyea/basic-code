package API.System;

public class SystemDemo3 {
    public static void main(String[] args) {
        //细节:
        //1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        //2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        //3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型


        //int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        //double[] arr2 = new double[10];
        //int[] arr2 = new int[5];

        /*System.arraycopy(arr1,0,arr2,0,10);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }*/

        Student s1 = new Student("heiye",19);
        Student s2 = new Student("baige",16);
        Student s3 = new Student("xiaohuang",2);

        Student[] arr1 = {s1, s2, s3};
        Person[] arr2 = new Student[3];

        System.arraycopy(arr1,0,arr2,0,3);

        for (int i = 0; i < arr2.length; i++) {
            Student stu = (Student) arr2[i];
            System.out.println(stu.getName() + ", " + stu.getAge());
        }

    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}

