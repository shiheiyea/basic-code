package String;

public class String10 {
    public static void main(String[] args) {
        String phoneNumber = "15202058598";

        //截取手机号码前三位
        //包头不包尾，包左不包右
        String start = phoneNumber.substring(0,3);

        //截取手机号后四位
        String end = phoneNumber.substring(7);

        String result = start + "****" + end;

        System.out.println(result);
    }
}
