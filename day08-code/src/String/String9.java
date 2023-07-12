package String;

import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money;

        while (true) {
            System.out.println("请录入一个金额：");
            money = sc.nextInt();
            if (0 <= money && money <= 9999999) {
                break;
            }
            else {
                System.out.println("金额无效");
            }
        }

        String moneyStr = "";
        while (money != 0) {
            int ge = money % 10;
            char capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
            money /= 10;
        }

        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        char[] arr = {'佰','拾','万','仟','佰','拾','元'};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char ch = moneyStr.charAt(i);
            result = result + ch + arr[i];
        }

        System.out.println(result);
    }

    public static char getCapitalNumber(int number) {
        char[] arr = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖','拾'};
        return arr[number];
    }
}
