package test.test6;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("小米", 3300, "白色");
        Phone p2 = new Phone("华为", 5999,"黑色");
        Phone p3 = new Phone("苹果", 5999,"绿色");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        int avg1 = sum / arr.length;

        double avg2 = sum * 1.0 / arr.length;

        System.out.println(avg1);
        System.out.println(avg2);
    }
}
