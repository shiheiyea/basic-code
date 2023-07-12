package test.test8;

public class Test {
    public static void main(String[] args) {
        /*
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性:学号，姓名，年龄。
        要求1: 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2: 添加完毕之后，遍历所有学生信息。
        要求3: 通过id删除学生信息
               如果存在，则删除，如果不存在，则提示删除失败。
        要求4:删除完毕之后，遍历所有学生信息。
        要求5: 查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
        */

        Student[] arr = new Student[3];

        Student stu1 = new Student(1,"语文", 50);
        Student stu2 = new Student(2,"数学", 25);
        Student stu3 = new Student(3,"日语", 16);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        /*
        Student stu4 = new Student(4,"英语",20);

        boolean flag = contains(arr, stu4.getId());
        //判断id是否重复
        if (flag) {
            int count = getCount(arr);
            //数组是否存满
            if (count == arr.length) {
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            }
            else {
                arr[count] = stu4;
                printArr(arr);
            }
        }
        else {
            System.out.println("当前id重复，请修改id后在添加");
        }
        */

        int index = getIndex(arr,2);
        if (index != -1) {
            Student stu = arr[index];
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            //arr[index] = null;
            printArr(arr);
        }
        else {
            //System.out.println("当前id不存在，删除失败");
            System.out.println("当前id不存在");
        }
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + ", " + stu.getName() + ", " + stu.getAge());
            }
        }
    }

    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu.getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
