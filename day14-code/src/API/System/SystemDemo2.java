package API.System;

public class SystemDemo2 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            boolean flag = isPrime2(i);
            if (flag) {
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    //34
    public static boolean isPrime1(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //656
    public static boolean isPrime2(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
