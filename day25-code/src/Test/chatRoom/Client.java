package Test.chatRoom;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1000);
        System.out.println("服务器已经连接成功");


        while (true) {
            System.out.println("==============欢迎来到impart================");
            System.out.println("1登录");
            System.out.println("2注册");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            switch (choose) {
                case "1"-> LoginAndRegister(socket, true);
                case "2"-> LoginAndRegister(socket, false);
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void LoginAndRegister(Socket socket, boolean flag) throws IOException {
        String choose;
        if (flag) {
            choose = "login";
        } else {
            choose = "register";
        }
        //获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        //拼接
        StringBuilder sb = new StringBuilder();
        //username=zhangsan&password=123
        sb.append("username=").append(username).append("&password=").append(password);

        //第一次写的是执行登录操作
        bw.write(choose);
        bw.newLine();
        bw.flush();

        //第二次写的是用户名和密码的信息
        //往服务器写出用户名和密码
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);
        if ("登录成功".equals(line) || "注册成功".equals(line)) {
            new Thread(new ClientMyRunnable(socket)).start();
            talk2All(bw);
        }
    }

    private static void talk2All(BufferedWriter bw) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要说的话");
            String str = sc.nextLine();
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
    }
}
