package StringBuilder;

public class StringBuilder4 {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        String str = arrToString(arr);
        System.out.println(str);
    }
    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sb.append('[').append(arr[i]);
            }
            else {
                sb.append(',').append(arr[i]);
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
