package test;

public class pan_duan_he_xun_huang_test17 {
    public static void main(String[] args) {
        /*
        需求:世界最高山峰是珠穆朗玛峰(8844,43米=8844430毫米)，
        假如我有一张足够大的纸，它的厚度是0.1毫米.
        请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
        */
        int count1 = 0, count2 = 0;
        double paper1 = 0.1, paper2 = 0.1;
        double height = 8844430;
        while (paper1 <= height) {
            paper1 *= 2;
            count1++;
        }
        System.out.println(count1);
        for (count2 = 0; paper2 <= height; count2++) {
            paper2 *= 2;
        }
        System.out.println(count2);
    }
}
