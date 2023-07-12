package test;

public class fang_fa_test9 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);//100
        number = change(number);
        System.out.println("调用change方法后:" + number);//100
    }
        public static int change(int number) {
            number = 200;
            return number;
        }
}
