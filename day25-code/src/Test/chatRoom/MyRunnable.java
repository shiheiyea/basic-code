package Test.chatRoom;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

public class MyRunnable implements Runnable {
    Socket socket;
    Properties prop;

    public MyRunnable(Socket socket, Properties prop) {
        this.socket = socket;
        this.prop = prop;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String choose = br.readLine();
                switch (choose) {
                    case "login" -> login(br);
                    case "register" -> register(br);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void register(BufferedReader br) throws IOException {
        String userinfo = br.readLine();
        String[] userInfoArr = userinfo.split("&");
        String usernameInput = userInfoArr[0].split("=")[1];
        String passwordInput = userInfoArr[1].split("=")[1];
        if (prop.containsKey(usernameInput)) {
            writeMessage2Client(socket, "用户名已经存在");
        } else if (!usernameInput.matches("[a-zA-Z0-9]{6,18}")) {
            writeMessage2Client(socket, "用户名格式错误");
        }else if (!passwordInput.matches("[a-zA-Z][0-9]{2,7}")) {
            writeMessage2Client(socket, "密码格式有误");
        } else {
            writeMessage2Client(socket, "注册成功");

            BufferedWriter bw = new BufferedWriter(new FileWriter("day25-code\\src\\Test\\chatRoom\\userinfo.txt", true));
            bw.write(usernameInput + "=" + passwordInput);
            bw.newLine();
            bw.close();

            Server.list.add(socket);
            talk2All(br, usernameInput);
        }
    }

    private void login(BufferedReader br) throws IOException {
        String userinfo = br.readLine();
        String[] userInfoArr = userinfo.split("&");
        String usernameInput = userInfoArr[0].split("=")[1];
        String passwordInput = userInfoArr[1].split("=")[1];
        if (!prop.containsKey(usernameInput)) {
            writeMessage2Client(socket, "用户名不存在");
        } else if (!prop.get(usernameInput).equals(passwordInput)) {
            writeMessage2Client(socket, "密码有误");
        } else {
            writeMessage2Client(socket, "登录成功");
            Server.list.add(socket);
            talk2All(br, usernameInput);
        }
    }

    private void talk2All(BufferedReader br, String username) throws IOException {
        while (true) {
            String message = br.readLine();
            System.out.println(username + "发送过来消息：" + message);
            for (Socket s : Server.list) {
                writeMessage2Client(s, username + "发送过来消息：" + message);
            }
        }
    }

    private static void writeMessage2Client(Socket socket, String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(message);
        bw.newLine();
        bw.flush();
    }
}
