package Test.ReflectTest.ReflectTest1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class ReflectTest {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        //对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去

        Student s = new Student("小A", 23, "女", 167.5, "睡觉");
        Teacher t = new Teacher("播妞", 10000);

        saveObject(s);

    }

    //把对象里面所有的成员变量名和值保存到本地文件中
    private static void saveObject(Object obj) throws IllegalAccessException, IOException {
        //1.获取字节码文件的对象
        Class clazz = obj.getClass();
        //2. 获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        BufferedWriter bw = new BufferedWriter(new FileWriter("day26-code\\src\\Test\\ReflectTest\\ReflectTest1\\a.txt"));
        for (Field field : fields) {
            field.setAccessible(true);
            //获取成员变量的名字
            String name = field. getName();
            //获取成员变量的值
            Object value = field.get(obj);
            //写出数据
            bw.write(name + "=" + value);
            bw.newLine();
        }
        bw.close();

    }
}
