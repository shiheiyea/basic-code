package test;

public class fang_fa_test8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] copyArr = copyOfRange(arr, 3, 8);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }
    public static int[] copyOfRange(int[] arr,int from,int to) {
        int[] newArr = new int[to - from];
        for (int i = from,j = 0; i < to; i++,j++) {
            newArr[j] = arr[i];
        }
        return newArr;
    }
}
