package test;

public class shu_zhu_test8 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个数组，存入1,2,3,4,5。交换首尾索引对应的元素。
        交换前: 1,2,3,4,5
        交换后: 5,2,3,4,1
        */
        /*
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        int[] temp = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i];
        }
        for (int i = temp.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = temp[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        */
        int[] arr = {1,2,3,4,5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
