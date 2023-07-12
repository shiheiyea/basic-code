package ji_he;

import java.util.ArrayList;
import java.util.Scanner;

public class ji_he8 {
    public static void main(String[] args) {
        /*
        需求:
          1，main方法中定义一个集合，存入三个用户对象。
          用户属性为: id，username，password
          2，要求: 定义一个方法，根据id查找对应的用户信息。
          如果存在，返回true
          如果不存在，返回false
        */
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("01","xiaohei","123");
        User u2 = new User("02","xiaohei","123");
        User u3 = new User("03","xiaohei","123");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入先查找的id：");
        String id = sc.next();

        boolean flag = contains(list,id);
        System.out.println(flag);
    }
    public static boolean contains(ArrayList<User> list, String id) {
        /*for (int i = 0; i < list.size(); i++) {
            *//*User u = list.get(i);
            String uid = u.getId();*//*
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;*/

        return getIndex(list,id) >= 0;
    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
