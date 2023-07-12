package Test.FileText;

import java.io.File;

public class FileText2 {
    public static void main(String[] args) {
        /*需求:
            定义一个方法找某一一个文件夹中，是否有以avi结尾的电影。
            (暂时不需要考虑子文件夹)
        */
        File file = new File("F:\\temp\\aaa");
        boolean b = haveAVI(file);
        System.out.println(b);

    }

    /*
    * 作用:用来找某一一个文件夹中，是否有以avi结尾的电影
    * 形参:要查找的文件夹
    * 返回值:查找的结果   存在true 不存在false
    */
    private static boolean haveAVI(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}
