package ji_he;

import java.util.ArrayList;

public class ji_he3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("日语学了吗？");
        list.add("数学学了吗？");
        list.add("英语单词背了吗？");
        list.add("JAVA学完了吗？");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.print(list.get(i));
            }
            else {
                System.out.print(", " + list.get(i));
            }
        }
        System.out.println("]");
    }
}
