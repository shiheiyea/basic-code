package Test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /*定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        要求1:属性有姓名、年龄、身高。
        要求2:按照年龄的大小进行排序，年龄一样， 按照身高排序，身高一样按照姓名的字母进行排序。
        (姓名中不要有中文或特殊字符，会涉及到后面的知识) */

        //1.创建三个女朋友的对象
        GirlFriend gf1 = new GirlFriend("tinyun", 18, 175.24);
        GirlFriend gf2 = new GirlFriend("leisheng", 18, 180.16);
        GirlFriend gf3 = new GirlFriend("dafong", 9, 150.8);

        //2.定义数组存储女朋友的信息
        GirlFriend[] arr = {gf1, gf2, gf3};

        //3.利用Arrays中的sort方法进行排序
        //匿名内部类lambda表达式
        //() -> {}
        //()   对应着抽象方法的形参
        //{}: 方法体
        Arrays.sort(arr, (o1, o2) -> {
            //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            if (temp > 0) {
                return 1;
            } else if (temp < 0) {
                return -1;
            } else {
                return 0;
            }
        });

        //4.展示一下数组中的内容
        System.out.println(Arrays.toString(arr));
    }
}
