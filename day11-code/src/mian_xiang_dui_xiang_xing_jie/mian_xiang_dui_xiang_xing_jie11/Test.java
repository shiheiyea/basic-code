package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie11;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("01","heiye",15000,8000);
        System.out.println(m.getId() + ", " + m.getName() + m.getSalary()  + ", " + m.getBouns());

        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("02");
        c.setName("baiye");
        c.setSalary(8000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());

        c.work();
        c.eat();
    }
}
