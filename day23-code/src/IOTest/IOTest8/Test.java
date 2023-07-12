package IOTest.IOTest8;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        需求:写一个登陆小案例。

        步骤:
            将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
            保存格式为:username=zhangsan&password=123&count=0
            让用户键盘录入用户名和密码
                比较用户录入的和正确的用户名密码是否一致
            如果一致则打印登陆成功
                如果不一致则打印登陆失败
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader("day23-code\\src\\IOTest\\IOTest8\\userinfo.txt"));

        String line = br.readLine();
        br.close();

        String[] arr = line.split("&");
        String rightUsername = arr[0].split("=")[1];
        String rightPassword = arr[1].split("=")[1];
        int count = Integer.parseInt(arr[2].split("=")[1]);

        if (rightUsername.equals(username) && count < 3 && rightPassword.equals(password)) {
            System.out.println("登录成功");
            count = 0;
        } else {
            count++;
            if (count < 3) {
                System.out.println("登录失败， 还剩下" + (3 - count) + "次机会");
            } else {
                System.out.println("密码连续输错三次被锁定");
            }
        }
        String str = "username=" + rightUsername + "&password=" + rightPassword + "&count=" + count;
        BufferedWriter bw = new BufferedWriter(new FileWriter("day23-code\\src\\IOTest\\IOTest8\\userinfo.txt"));
        bw.write(str);
        bw.close();
    }
}
