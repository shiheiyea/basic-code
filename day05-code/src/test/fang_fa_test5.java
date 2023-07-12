package test;

public class fang_fa_test5 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        printArr(arr);

        /*
        System.out.println("abc");//先打印abc，再进行换行
        System.out.print("abc");//只打印abc，不换行
        System.out.print("bcd");
        System.out.println();//不打印任何数据，只做换行处理
        */
    }
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            }
            else {
                System.out.print("," + arr[i]);
            }
        }
        System.out.print("]");
    }
}
