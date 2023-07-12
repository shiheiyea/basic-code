package test;

public class Student {
    private String id;
    private String name;
    private int age;
    private String Address;

    public Student() {
    }

    public Student(String id, String name, int age, String zhuZhi) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Address = zhuZhi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String Address() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }
}
