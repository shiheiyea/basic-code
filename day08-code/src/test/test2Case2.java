package test;

public class test2Case2 {
    public static void main(String[] args) {
        /*
        给定两个字符串A 和 B，
        A和A的旋转操作就是将A 最左边的字符移动到最右边。
        例如，若A =abcde'，在移动一次之后结果就是'bcdea
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false
        */

        String strA = "abcde";
        String strB = "bcdea";

        System.out.println(check(strA,strB));
    }

    public static String rotate(String str) {
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        String result = new String(arr);
        return result;
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            String rotate = rotate(strA);
            if (rotate.equals(strB)) {
                return true;
            }
        }
        return false;
    }
}
