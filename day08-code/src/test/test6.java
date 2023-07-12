package test;

public class test6 {
    public static void main(String[] args) {
        /*
        给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
            返回字符串中最后一个单词的长度。
            单词是指仅由字母组成、不包含任何空格字符的最大子字符串。

            示例 1:输入: s = "Hello world"              输出:5
            解释: 最后一个单词是“world”，长度为5。

            示例 2: 输入: s = 输出:"fly me to the moon"   输出：4
            解释: 最后一个单词是“moon”，长度为4。

            示例 3:输入: s = "luffy is still joyboy"    输出：6
            解释: 最后一个单词是长度为6的“joyboy”。
        */

            //倒着遍历
            //直到遇到空格为止
            //那么遍历的次数就是单词的长度
        String str = "luffy is still joyboy";
        //StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int length = str.length() - 1; length > 0; length--) {
            char ch = str.charAt(length);
            if (ch != ' ') {
                //sb.append(ch);
                count++;
            }
            else {
                break;
            }
        }
        //int len = sb.length();
        //System.out.println(len);
        System.out.println(count);
    }
}
