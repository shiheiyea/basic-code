package CharStream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {

        //flush刷新:刷新之后，还可以继续往文件中写出数据

        FileWriter fw = new FileWriter("day21-code\\a.txt");

        /*for (int i = 0; i < 8193; i++) {
            fw.write(97);
        }*/

        fw.write("我的同学各个都很厉害");
        fw.write("说话声音很好听");

        fw.flush();

        fw.write("都是人才"); 
        fw.write("超爱这里哟");

        //fw.close();

        fw.write("B站");

    }
}
