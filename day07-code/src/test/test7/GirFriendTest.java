package test.test7;

public class GirFriendTest {
    public static void main(String[] args) {
        GirFriend[] arr = new GirFriend[4];

        GirFriend gf1 = new GirFriend("雷神", 24, "憨憨的萌妹纸", "甜食");
        GirFriend gf2 = new GirFriend("爱丽希雅", 18, "可爱的萌妹纸", "好奇");
        GirFriend gf3 = new GirFriend("神里凌华", 18, "可爱的萌妹纸", "跟我玩");
        GirFriend gf4 = new GirFriend("妮露", 19, "可爱的萌妹纸", "让我看她跳舞");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirFriend gf = arr[i];
            sum += gf.getAge();
        }

        int avg = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            GirFriend gf = arr[i];
            if (gf.getAge() < avg) {
                System.out.println(gf.getName() + ", " + gf.getAge() + ", " + gf.getGender() + ", " + gf.getHobby());
            }
        }
    }
}
