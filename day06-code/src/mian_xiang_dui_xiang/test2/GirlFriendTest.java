package mian_xiang_dui_xiang.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("雷神");
        gf1.setAge(18);
        gf1.setGender("憨憨的妹子");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());
        gf1.eat();
        gf1.sleep();

        System.out.println("=======================");

        GirlFriend gf2 = new GirlFriend();
        gf2.setName("爱莉希雅");
        gf2.setAge(18);
        gf2.setGender("可爱的妹子");

        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());
        gf2.eat();
        gf2.sleep();
    }
}
