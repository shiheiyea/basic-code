package ObjectSteam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectSteamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        需求:
            利用反序列化流/对象操作输入流，把文件中中的对象读到程序当中
        构造方法:
            public objectInputStream(InputStream out)              把基本流变成高级流
        成员方法:
            public object readObject()                             把序列化到本地文件中的对象，读取到程序中来
        */

        //1.创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day22-code\\a.txt"));

        //2.读取数据
        Student o = (Student) ois.readObject();

        //3.打印对象
        System.out.println(o);

        //4.释放资源
        ois.close();

    }
}
