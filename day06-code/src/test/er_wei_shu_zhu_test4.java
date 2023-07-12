package test;

public class er_wei_shu_zhu_test4 {
    public static void main(String[] args) {
        /*
        需求:
        把一个数组中的元素复制到另一个新数组中去。
        */
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
