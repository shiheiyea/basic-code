package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentSystemPlus {
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("heiye","123","4401832004031375173","15202058598"));
    }
    public static void main(String[] args) {
        //ArrayList<User> list = new ArrayList<>();
        while (true) {
            System.out.println("------------欢迎来到学生管理系统------------");
            System.out.println("请输入您的选择：");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("4.退出");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgotPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUser() + ", " + user.getPassword() + ", " + user.getId() + ", " + user.getPhone());
        }
    }

    public static void login(ArrayList<User> list) {
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (contains(list, name)) {
            System.out.println("用户名" + name + "未注册，请先注册");
            return;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码：");
            String password = sc.next();
            while (true) {
                //String captcha = Captcha();
                String captcha = getCode();
                System.out.println("验证码为：" + captcha);
                System.out.println("请输入验证码：");
                String userCaptcha = sc.next();
                if (!userCaptcha.equalsIgnoreCase(captcha)) {
                    System.out.println("验证码输入错误请重新输入");
                    continue;
                } else {
                    break;
                }
            }
            User userInfo = new User(name, password, null, null);
            boolean result = checkUserInfo(list, userInfo);
            /*int count = 3;
            while (true) {
                if (userLoginFind(list, name, password)) {
                    System.out.println("登录成功");
                    break;
                } else if (count == 0) {
                    System.out.println("密码错误太多，请30分钟后重试");
                    break;
                } else if (!userLoginFind(list, name, password)) {
                    count--;
                    System.out.println("密码错误，请重新输入，还剩" + count + "次机会");
                }

                System.out.println("请输入密码：");
                password = sc.next();
            }
            break;
        }*/
            if (result) {
                System.out.println("登录成功");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            } else {
                if (i == 2) {
                    System.out.println("用户" + name + "密码错误次数太多已被锁定");
                    return;
                } else {
                    System.out.println("用户名或密码错误，还剩下" + (2 - i) + "次机会");
                    continue;
                }
            }
        }
    }

    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUser().equals(userInfo.getUser()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        //用户名判断
        String username;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                continue;
            }
            boolean flag2 = contains(list, username);
            if (!flag2) {
                System.out.println("用户名" + username + "已存在请重新输入");
            } else {
                System.out.println("用户名可用" + username + "可用");
                break;
            }
            /*
            String name = sc.next();
            //用户名长度判断
            int len = name.length();
            if (3 <= len && len <= 15) {
                int count = 0;
                for (int i = 0; i < len; i++) {
                    char ch = name.charAt(i);
                    if ('0' <= ch && ch <= '9') {
                        count++;
                    }
                }
                //用户名是否为纯数字
                if (count == len) {
                    System.out.println("用户名只能是字母加数字的组合，不能是纯数字");
                    System.out.println("请重新输入");
                } else {
                    //用户名是否已有
                    if (uniqueness(list, name)) {
                        System.out.println("已有用户名");
                        System.out.println("请重新输入");
                    } else {
                        user.setUser(name);
                        System.out.println("用户名输入成功");
                        break;
                    }
                }
            } else {
                System.out.println("用户名长度必须在3~15位之间");
                System.out.println("请重新输入");
            }*/
        }
        //密码判断
        String password1;
        while (true) {
            System.out.println("请输入密码：");
            password1 = sc.next();
            System.out.println("再次输入密码：");
            String password2 = sc.next();
            if (password1.equals(password2)) {
                System.out.println("两次密码一致");
                break;
            } else {
                System.out.println("第一次密码与第二次密码不一致");
                System.out.println("请重新输入");
            }
        }
        //身份证号码判断
        String id;
        while (true) {
            System.out.println("请输入身份证号码：");
            id = sc.next();
            boolean flag = checkPersonID(id);
            if (!flag) {
                continue;
            } else {
                System.out.println("身份证号码符合要求");
                break;
            }
            /*
            System.out.println("请输入身份证号码：");
            String id = sc.next();
            //身份证号码长度判断
            if (id.length() == 18) {
                if (id.charAt(0) == '0') {
                    System.out.println("身份证号码不以0为开头");
                    System.out.println("请重新输入");
                } else {
                    for (int i = 0; i <= id.length() - 1; i++) {
                        //身份证号码前17位判断
                        if (('A' <= id.charAt(i) && id.charAt(i) <= 'Z') || ('a' <= id.charAt(i) && id.charAt(i) <= 'z')) {
                            System.out.println("身份证前17位应都为数字");
                            System.out.println("请重新输入");
                        }
                    }
                    //身份证号码最后一位判断
                    if (id.charAt(17) == 'X' || id.charAt(17) == 'x' || ('1' <= id.charAt(17) && id.charAt(17) <= '9')) {
                        user.setId(id);
                        System.out.println("身份证号码输入成功");
                        break;
                    } else {
                        System.out.println("身份证号码最后一位应为数字，大写X或小写x");
                        System.out.println("请重新输入");
                    }
                }
            } else {
                System.out.println("身份证长度有误");
                System.out.println("请重新输入");
            }
             */
        }
        //手机号验证
        String phone;
        while (true) {
            System.out.println("请输入手机号码：");
            phone = sc.next();
            boolean flag = checkPhoneNumber(phone);
            if (!flag) {
                continue;
            } else {
                System.out.println("手机号码格式正确");
                break;
            }
            /*//手机号开头判断
            if (phone.charAt(0) == '0') {
                System.out.println("手机号开头不为0");
                System.out.println("请重新输入");
            } else {
                int count = 0;
                //手机号是否全为数字判断
                for (int i = 0; i < phone.length(); i++) {
                    if ('0' <= phone.charAt(i) && phone.charAt(i) <= '9') {
                        count++;
                    }
                }
                if (count == phone.length()) {
                    //手机号长度判断
                    if (phone.length() == 11) {
                        user.setPhone(phone);
                        System.out.println("手机号验证成功");
                        break;
                    } else {
                        System.out.println("手机号长度应为11位");
                        System.out.println("请重新输入");
                    }
                } else {
                    System.out.println("手机号应全为数字");
                    System.out.println("请重新输入");
                }
            }*/
        }
        User u = new User(username, password1, id, phone);
        list.add(u);
        System.out.println("注册成功");
        printList(list);
    }

    private static boolean checkUsername(String username) {
        //用户名长度判断
        int len = username.length();
        if (len < 3 || 15 < len) {
            System.out.println("用户名长度必须在3~15位之间");
            System.out.println("请重新输入");
            return false;
        }
        //用户名是否为其他字符
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9'))) {
                System.out.println("用户名只能是字母加数字的组合");
                System.out.println("请重新输入");
                return false;
            }
        }
        //用户名是否为纯数字
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
                return true;
            }
        }
        System.out.println("用户名不能为纯数字");
        return false;
    }

    private static boolean checkPersonID(String personID) {
        //身份证号码长度判断
        if (personID.length() != 18) {
            System.out.println("身份证长度有误");
            System.out.println("请重新输入");
            return false;
        }
        boolean flag = personID.startsWith("0");
        if (flag) {
            System.out.println("身份证号码不以0为开头");
            System.out.println("请重新输入");
            return false;
        }
        /*if (personID.charAt(0) == '0') {
            System.out.println("身份证号码不以0为开头");
            System.out.println("请重新输入");
            return false;
        }*/
        for (int i = 0; i < personID.length() - 1; i++) {
            //身份证号码前17位判断
            char ch = personID.charAt(i);
            if (!('0' <= ch && ch <= '9')) {
                System.out.println("身份证前17位应都为数字");
                System.out.println("请重新输入");
                return false;
            }
        }
        char endChar = personID.charAt(personID.length() - 1);
        if (!(endChar == 'X' || endChar == 'x' || ('0' <= endChar && endChar <= '9'))) {
            System.out.println("身份证号码最后一位应为数字，大写X或小写x");
            System.out.println("请重新输入");
            return false;
        }
        return true;
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            System.out.println("手机号长度应为11位");
            System.out.println("请重新输入");
            return false;
        }
        if (phoneNumber.startsWith("0")) {
            System.out.println("手机号开头不为0");
            System.out.println("请重新输入");
            return false;
        }
        //手机号是否全为数字判断
        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if (!('0' <= ch && ch <= '9')) {
                System.out.println("手机号应全为数字");
                System.out.println("请重新输入");
                return false;
            }
        }
        return true;
    }

    /*public static String Captcha() {
        char[] arr = new char[52];
        for (int i = 0; i < 52; i++) {
            if (i < 26) {
                arr[i] = (char) ('a' + i);
            } else {
                arr[i] = (char) ('A' + i - 26);
            }
        }
        char[] newArr = new char[5];
        Random r = new Random();
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[r.nextInt(arr.length)];
        }
        newArr[r.nextInt(newArr.length)] = (char) (r.nextInt(10) + '0');
        String str = new String(newArr);
        System.out.println(str);
        return str;
    }*/
    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        //从集合里选出4个字母放进容器里
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char ch = list.get(index);
            sb.append(ch);
        }
        //随机出数字
        int number = r.nextInt(10);
        sb.append(number);
        //转换为数组将数字随机插入
        char[] arr = sb.toString().toCharArray();

        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return new String(arr);
    }

    public static void forgotPassword(ArrayList<User> list) {
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (contains(list, name)) {
            System.out.println("用户名未注册，请先注册");
            return;
        }
        while (true) {
            System.out.println("请输入身份证号码：");
            String id = sc.next();
            System.out.println("请输入手机号码：");
            String phone = sc.next();

            int index = findIndex(list,name);

            User user = list.get(index);

            if (!((user.getId().equals(id)) && (user.getPhone().equals(phone)))) {
                System.out.println("身份证号码或手机号码错误请重新输入");
                return;
            }

            String password;
            while (true) {
                System.out.println("请输入新的密码：");
                password = sc.next();
                System.out.println("再次输入新的密码：");
                String againPassword = sc.next();
                if (password.equals(againPassword)) {
                    System.out.println("两次密码输入一致");
                    break;
                } else {
                    System.out.println("两次密码输入不一致，请重新输入");
                    continue;
                }
            }
            user.setPassword(password);
            System.out.println("密码输入成功");
            /*if (userForgotPasswordFind(list, name, id, phone) != -1) {
                System.out.println("请输入想要修改的密码：");
                String password = sc.next();
                int index = userForgotPasswordFind(list, name, id, phone);
                User user = list.get(index);
                user.setPassword(password);
                System.out.println("修改密码成功");
                break;
            } else {
                System.out.println("身份证号码或手机号码错误请重新输入");
            }*/
        }
    }

    private static int findIndex(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUser().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            User UserOnly = list.get(i);
            if (UserOnly.getUser().equals(name)) {
                return false;
            }
        }
        return true;
    }

    /*public static boolean userLoginFind(ArrayList<User> list, String name, String password) {
        for (int i = 0; i < list.size(); i++) {
            User UserOnly = list.get(i);
            if (UserOnly.getUser().equals(name)) {
                if (UserOnly.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }*/

    /*public static int userForgotPasswordFind(ArrayList<User> list, String name, String personID, String phone) {
        for (int i = 0; i < list.size(); i++) {
            User UserOnly = list.get(i);
            if (UserOnly.getUser().equals(name)) {
                if (UserOnly.getId().equals(personID) && UserOnly.getPhone().equals(phone)) {
                    return i;
                }
            }
        }
        return -1;
    }*/
}