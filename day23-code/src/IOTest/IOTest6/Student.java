package IOTest.IOTest6;

public class Student {
    private String name;
    private String gender;
    private int age;
    private int flag;

    public Student() {
    }

    public Student(String name, String gender, int age, int flag) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.flag = flag;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return flag
     */
    public int getFlag() {
        return flag;
    }

    /**
     * 设置
     * @param flag
     */
    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String toString() {
        return name + "-" + gender + "-" + age + "-" + flag;
    }
}
