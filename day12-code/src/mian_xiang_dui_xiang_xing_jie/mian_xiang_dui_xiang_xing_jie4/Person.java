package mian_xiang_dui_xiang_xing_jie.mian_xiang_dui_xiang_xing_jie4;

import javax.print.attribute.standard.MediaSize;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String something) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "的" + a.getColor() + "岁的狗");
        if (a instanceof Dog d) {
            d.eat(something);
            d.lookHome();
        } else if (a instanceof Cat c) {
            c.eat(something);
            c.catchMouse();
        }
    }
}
